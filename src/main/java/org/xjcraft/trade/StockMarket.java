package org.xjcraft.trade;

import io.ebean.EbeanServer;
import org.bukkit.plugin.Plugin;
import org.xjcraft.CommonPlugin;
import org.xjcraft.blockFML.BlockFMLListener;
import org.xjcraft.trade.config.Config;
import org.xjcraft.trade.utils.SerializeUtil;

/**
 * Created by Ree on 2016/1/7.
 */
public class StockMarket extends CommonPlugin {
    Plugin plugin;

    @Override
    public void onEnable() {
        super.onEnable();
        this.plugin = this;
        SerializeUtil.plugin = this;
        loadConfigs();
        EbeanServer db = getEbeanServer(this.plugin.getName());
        Dao dao = new Dao(db);
        StockMarketManager manager = new StockMarketManager(this, dao);
        setupListeners(manager);
        registerCommand(new StockMarketCommands(manager));
        getLogger().info("StockMarket has been enabled");
    }

    private void setupListeners(StockMarketManager manager) {
        if (Config.config.getShop_enable()) {
//            getServer().getPluginManager().registerEvents(new StockMarketListener(this,manager), this);
            getServer().getPluginManager().registerEvents(new StockMarketListener(this, manager), this);
        }
        if (Config.config.getBlockFML()) {
            getServer().getPluginManager().registerEvents(new BlockFMLListener(this), this);
        }
    }


    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("StockMarket has been disabled");
    }
}

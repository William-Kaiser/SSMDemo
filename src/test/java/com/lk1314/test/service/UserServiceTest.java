package com.lk1314.test.service;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.lk1314.entity.User;
import com.lk1314.service.UserService;
import com.lk1314.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liankai
 */

public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        User user =  userService.selectRolesAndPermsByName("小米");
    }

    @Test
    public void generateCode(){
        String packageName = "com.lk1314.generator";
        boolean serviceNameStartWithI = true;//user -> UserService, 设置成true: user -> IUserService
        //generateByTables(serviceNameStartWithI,packageName, "test_role","test_user");
    }

    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames){
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://10.100.2.30:3306/crisp?useUnicode=true&characterEncoding=utf-8";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("xgit123")
                .setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setTablePrefix(new String[] { "test_" })
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(true)
                .setAuthor("william")
                .setOutputDir("D:\\IdeaProject\\SSMDemo\\src\\main\\java")
                .setFileOverride(true);
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        config.setMapperName("%sMapper");
        config.setXmlName("%sMapper");
        config.setServiceName("%sService");
        config.setServiceImplName("%sServiceImpl");
        config.setControllerName("%sController");
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }
        PackageConfig pc = new PackageConfig();
        pc.setParent(null);
        pc.setEntity("com.lk1314.entity");
        pc.setMapper("com.lk1314.mapper");
        pc.setXml("com.lk1314.mapper");
        pc.setService("com.lk1314.service");
        pc.setServiceImpl("com.lk1314.service.impl");
        pc.setController("com.lk1314.controller");

        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(pc)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")
                ).execute();
    }
}

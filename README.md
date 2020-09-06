# mall_example
电商项目

## 运行步骤：
1. 准备好数据库
2. 运行mall_eureka_server，端口9020
3. 运行mall_product_cloud，端口9011
4. 运行mall_web，端口9001

## 提交记录
commit 2020-09-06 17:59
1. 更改项目结构，改为mall_eureka_server，mall_product_cloud，mall_web三个模块
2. mall_eureka_server为SpringCloud注册中心模块，服务在此注册发现，调用localhost:9020可查看服务注册情况
3. mall_product_cloud为提供电商产品相关功能的微服务，服务名mall-product-cloud
4. mall_web为电商平台主web后端
5. 增加一个简单的获取商品信息的接口

commit 2020-09-06 13:18  
新建项目  
步骤：
1. 新建空maven项目，仅保留pom.xml
2. 点击File-New-Module，在项目中新建两个模块，分别是SpringBoot和SpringCloud项目(Spring Initializr)
3. 主文件夹中的pom.xml中添加两个模块的公共依赖
4. 各模块的pom.xml中将主文件夹pom.xml设为父依赖(<parent></parent>)
5. 各自单独的依赖放在各自模块的pom.xml中引入

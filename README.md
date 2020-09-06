# mall_example
电商项目

commit 2020-09-06  
新建项目  
步骤：
1. 新建空maven项目，仅保留pom.xml
2. 点击File-New-Module，在项目中新建两个模块，分别是SpringBoot和SpringCloud项目(Spring Initializr)
3. 主文件夹中的pom.xml中添加两个模块的公共依赖
4. 各模块的pom.xml中将主文件夹pom.xml设为父依赖(<parent></parent>)
5. 各自单独的依赖放在各自模块的pom.xml中引入

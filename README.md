Refer to this for more details - https://ghchirp.tech/311/

XStream was removed from Cucumber-JVM in version 3 for various reasons. Though it reduced a lot of complexities, it removed functionality which automatically transformed a String to a object and DataTable into a collection of objects. This now requires code for each transformation to define a DataTableType or ParamterType in the TypeRegistry for these cases. This has been made easier in Cucumber-JVM 4.2.0 for Parameters and for DataTables in 4.0.0 by using Jackson ObjectMapper.

This article explains in brief the handling of parameters in Cucumber-JVM versions 4.2.0 and above.

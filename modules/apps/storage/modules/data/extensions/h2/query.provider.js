/*
Description: The class is used to read the db scripts and prepare the create statements
Filename: query.provider.js
Created Date: 15/10/2013
*/

var queryProvider=function(){

    var dbScriptManager=require('/modules/data/common/db.script.manager.js').dbScriptManagerModule().getInstance();

    var MYSQL_DRIVER='h2';
    var log=new Log('query.provider');
    /*
     The function builds a CREATE sql statement based on the provided schema
     */
    function create(schema){
        var query=dbScriptManager.find(MYSQL_DRIVER,schema.table);
        return query;
    }

    return{
        create:create
    }

};
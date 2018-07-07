this is the java API for data returned by query "desc $tables".

Usage: 

 
 
 
 
 
 a desc tablename esponse example: 
 
 {
   "query":{
      "count":1,
      "created":"2012-09-06T17:12:52Z",
      "lang":"en-US",
      "diagnostics":{
         "publiclyCallable":"true",
         "user-time":"1",
         "service-time":"0",
         "build-version":"29730"
      },
      "results":{
         "table":{
            "hash":"2143dbc888c9ccf3daac6778d0f57a32",
            "name":"answers.getquestion",
            "security":"ANY",
            "meta":{
               "author":"James Broad",
               "documentationURL":"http://developer.yahoo.com/answers/V1/getQuestion.html",
               "sampleQuery":"select * from answers.getquestion where question_id=\"20090526102023AAkRbch\""
            },
            "request":{
               "select":{
                  "key":[
                     {
                        "name":"appid",
                        "private":"true",
                        "type":"xs:string"
                     },
                     {
                        "name":"question_id",
                        "required":"true",
                        "type":"xs:string"
                     }
                  ]
               }
            }
         }
      }
   }
}
<#ftl strip_whitespace=true>
<#assign xhtmlCompliant = true>
<#setting url_escaping_charset="UTF-8">

<#import "/macro-dependency.ftl" as dependency/>

<#macro fullGreeting userName>
   <@dependency.hello userName />, how are you?
</#macro>

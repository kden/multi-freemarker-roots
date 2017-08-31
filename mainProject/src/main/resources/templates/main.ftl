<#import "/macro-main.ftl" as main/>
<#import "/macro-dependency.ftl" as dependency/>
<#import "/more-macros.ftl" as more/>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" version="XHTML+RDFa 1.0" dir="ltr" class="no-js">
<head><title></title></head>
<body>
<p><@dependency.hello userName!'Fred' /></p>
<p><@main.fullGreeting userName!'Fred' /></p>
<p><@more.alternateGreeting userName!'Fred' /></p>

</body>
</html>

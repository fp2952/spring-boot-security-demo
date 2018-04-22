<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" href="${request.contextPath}/webjars/Semantic-UI/2.2.10/semantic.min.css"/>
</head>
<style type="text/css">
    body {
        background-color: #DADADA;
    }
    body > .grid {
        height: 100%;
    }
    .image {
        margin-top: -100px;
    }
    .column {
        max-width: 450px;
    }
</style>
<body>
<div class="ui middle aligned center aligned grid">
    <div class="column">
        <div class="ui large form">
            <div class="ui stacked segment">
                <div class="ui grid">
                    <div class="left aligned sixteen wide column">
                        你好，${userInfo.nikeName}<br>
                        你的角色:<br>
                        <#list  roleList  as  item>
                            <i class="user icon"></i>${item.roleName!}<br/>
                        </#list>
                        你的菜单：<br>
                        <#list  menuList  as  item>
                            -- ${item.menuUrl!}<br/>
                        </#list>
                    </div>
                    <div class="sixteen wide column">
                        <button id="out" class="ui primary button">登出 </button>
                    </div>
                    <form id="form" action="${request.contextPath}/logout" method='post'>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script src="${request.contextPath}/webjars/jquery/3.2.1/jquery.min.js" ></script>
<script src="${request.contextPath}/webjars/Semantic-UI/2.2.10/semantic.min.js" ></script>
<script>
    $("#out").click(function () {
        $("#form").submit();
    })

</script>
</html>
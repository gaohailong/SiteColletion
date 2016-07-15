//第一次加载数据
function onload(){
	$.ajax({
        type: "GET",
        url: "http://localhost:8080/SiteColletion/SiteServlet?",
        dataType: "JSON",
        success: function (data) {// 带参数则为设值，不带参数为取值
            	$(data).each(function(index,value){
            		$("#android").append("<li><a href='#' target='_blank'>"+value+"</a></li>");
            	});
        },
        error: function (jqXHR) {
            alert("发生错误" + jqXHR.status);
        }
    });
}
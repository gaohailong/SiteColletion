//第一次加载数据
function onload(){
	$.ajax({
        type: "GET",
        url: "/SiteColletion/SiteServlet?method=all",
        dataType: "JSON",
        success: function (data) {
        	$(data).each(function(index,value){
        		if (value.categeory==1) {
        			$("#android").append("<li><a href='"+value.link+"' onclick='counter("+value.id+")' target='_blank'>"+value.name+"</a></li>");
				} else if(value.categeory==2){
					$("#JavaWeb").append("<li><a href='"+value.link+"' onclick='counter("+value.id+")' target='_blank'>"+value.name+"</a></li>");
				}
            });
        },
        error: function (jqXHR) {
            alert("发生错误" + jqXHR.status);
        }
    });
}

//设置计数器
function counter(id){
	var data={"id":id};
	
	$.ajax({
        type: "GET",
        url: "/SiteColletion/SiteServlet?method=counter",
        dataType:"text",
        data:data,
        success: function () {
        },
        error: function (jqXHR) {
            alert("发生错误" + jqXHR.status);
        }
    });
}

//设置添加网站的点击事件
$(".add").click(function(){
	$(".pop").css("display","block");
});

//设置居中的方法
function setCenter(){
	var _top = ($(window).height() - $(".pop").height()) / 2;
	var _left = ($(window).width() - $(".pop").width()) / 2;
	$(".pop").css({top:_top,left:_left});
}
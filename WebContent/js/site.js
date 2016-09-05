//第一次加载数据
function onload() {
	$.ajax({
		type : "GET",
		url : "/SiteColletion/SiteServlet?method=all",
		dataType : "JSON",
		success : function(data) {
			$(data).each(
					function(index, value) {
						if (value.categeory == 1) {
							$("#android").append(
									"<li><a href='" + value.link
											+ "' onclick='counter(" + value.id
											+ ")' target='_blank'>"
											+ value.name + "</a></li>");
						} else if (value.categeory == 2) {
							$("#JavaWeb").append(
									"<li><a href='" + value.link
											+ "' onclick='counter(" + value.id
											+ ")' target='_blank'>"
											+ value.name + "</a></li>");
						}
					});
		},
		error : function(jqXHR) {
			alert("发生错误" + jqXHR.status);
		}
	});
}

// 设置计数器
function counter(id) {
	var data = {
		"id" : id
	};

	$.ajax({
		type : "GET",
		url : "/SiteColletion/SiteServlet?method=counter",
		dataType : "text",
		data : data,
		success : function() {
		},
		error : function(jqXHR) {
			alert("发生错误" + jqXHR.status);
		}
	});
}

// 设置添加网站的点击事件
$(".add").click(function() {
	$.ajax({
		type : "GET",
		url : "/SiteColletion/SiteServlet?method=getCollectType",
		dataType : "JSON",
		success : function(data) {
			$(data).each(function(index,value) {
				$(".p_categeory").append(
					"<option value='"+value.id+"'>"+value.type+"</option>"
				)
			});
		}
	});
	$(".pop").css("display", "block");
	setCenter()
});

// 点击关闭
$(".p_close").click(function() {
	$(".pop").css("display", "none");
});

// 添加网站
$(".p_submit").click(function() {
	var name = $(".p_name").val();
	var link = $(".p_link").val();
	var categeory;

	$(".p_categeory :selected").each(function(){
		categeory=this.value;
	});
	
	var data = {
		"name" : name,
		"link" : link,
		"categeory" : categeory
	};
	
	if(name==""){
		alert("名称不能为空！");
	} else if (link==""){
		alert("链接不能为空！");
	} else if (categeory==""){
		alert("分类不能为空！");
	} else {
		$.ajax({
			type : "GET",
			url : "/SiteColletion/SiteServlet?method=addSite",
			dataType : "text",
			data : data,
			success : function() {
				alert("添加成功");
				$(".pop").css("display", "none");
				/*
				 * if (categeory == 1) { $("#android").append( "<li><a href='" +
				 * link + "' onclick='counter(" + id + ")' target='_blank'>" + name + "</a></li>"); }
				 * else if (categeory == 2) { $("#JavaWeb").append( "<li><a
				 * href='" + link + "' onclick='counter(" + id + ")'
				 * target='_blank'>" + name + "</a></li>"); }
				 */
			},
			error : function(jqXHR) {
				alert("发生错误" + jqXHR.status);
			}
		});
	}
});

// 设置点击添加网站按钮的位置
function setRight() {
	var _left = ($(window).width() - $(".pop").width()) / (6 / 8);
	$(".add").css({
		left : _left
	});
}

// 设置居中的方法
function setCenter() {
	var _top = ($(window).height() - $(".pop").height()) / 2;
	var _left = ($(window).width() - $(".pop").width()) / 2;
	$(".pop").css({
		top : _top,
		left : _left
	});
}

// 显示灰色 jQuery 遮罩层
function showBg() {
	var bh = $("body").height();
	var bw = $("body").width();
	$("#fullbg").css({
		height : bh,
		width : bw,
		display : "block"
	});
}
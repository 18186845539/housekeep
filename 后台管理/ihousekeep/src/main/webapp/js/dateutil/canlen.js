var outDiv = null;// 全局变量
var table = null;

var inputdateObj = null;
function createOutDiv(obj) {
	
	inputdateObj = obj;
	
	var mydate = new Date();
	var year = mydate.getFullYear();// 年
	var month = mydate.getMonth();// 月
	var day = mydate.getDate();// 日

	if (outDiv != null) {
		document.body.removeChild(outDiv);
		outDiv = null;
	}

	outDiv = document.createElement("div");
	outDiv.style.width = "200px";
	outDiv.style.height = "200px";
	outDiv.style.border = "1px red solid";

	var topDiv = document.createElement("div");
	topDiv.style.width = "200px";
	topDiv.style.height = "30px";
	topDiv.style.backgroundColor = "lightgray";

	var leftDiv = document.createElement("div");
	leftDiv.style.width = "20px";
	leftDiv.style.height = "20px";
	leftDiv.style.backgroundColor = "greenyellow";
	leftDiv.innerHTML = "<";
	leftDiv.style.textAlign = "center";
	leftDiv.style.marginTop = "5px";
	leftDiv.style.marginLeft = "5px";
	leftDiv.style.float = "left";
	leftDiv.style.lineHeight = "1em";
	leftDiv.style.cursor = "pointer";

	var rightDiv = document.createElement("div");
	rightDiv.style.width = "20px";
	rightDiv.style.height = "20px";
	rightDiv.style.backgroundColor = "greenyellow";
	rightDiv.innerHTML = ">";
	rightDiv.style.textAlign = "center";
	rightDiv.style.marginTop = "5px";
	rightDiv.style.marginRight = "5px";
	rightDiv.style.float = "right";
	rightDiv.style.lineHeight = "1em";
	rightDiv.style.cursor = "pointer";

	var centerDiv = document.createElement("div");
	centerDiv.style.width = "130px";
	centerDiv.style.height = "20px";
	centerDiv.style.marginLeft = "10px";
	centerDiv.style.marginTop = "5px";
	centerDiv.style.float = "left";
	centerDiv.style.backgroundColor = "gold";
	centerDiv.innerHTML = year + "年" + (month + 1) + "月" + day + "日";
	centerDiv.style.textAlign = "center";
	centerDiv.style.lineHeight = "1em";

	leftDiv.onclick = function() {
		mydate.setMonth(mydate.getMonth() - 1);
		centerDiv.innerHTML = mydate.getFullYear() + "年"
				+ (mydate.getMonth() + 1) + "月" + mydate.getDate() + "日";
		if (table != null) {
			outDiv.removeChild(table);
			table = null;
		}
		createTable(mydate);
	}

	rightDiv.onclick = function() {
		mydate.setMonth(mydate.getMonth() + 1);
		centerDiv.innerHTML = mydate.getFullYear() + "年"
				+ (mydate.getMonth() + 1) + "月" + mydate.getDate() + "日";
		if (table != null) {
			outDiv.removeChild(table);
			table = null;
		}
		createTable(mydate);
	}

	topDiv.appendChild(leftDiv);
	topDiv.appendChild(centerDiv);
	topDiv.appendChild(rightDiv);
	outDiv.appendChild(topDiv);
	document.body.appendChild(outDiv);

	createTable(mydate);// 调用创建表格方法
}

function createTable(mydate) {
	table = document.createElement("table");
	table.border = "1px"
	table.style.textAlign = "center";
	table.width = "200px";
	table.height = "170px";
	var week = [ "日", "一", "二", "三", "四", "五", "六" ];
	var d = new Date();// 获取当前日期
	d.setFullYear(mydate.getFullYear());
	d.setMonth(mydate.getMonth());
	var month = d.getMonth();
	d.setDate(1);// 将当前日期设置成此月份的1号
	var w = d.getDay();
	d.setDate(d.getDate() - w);

	var time = new Date();

	var color;
	for (var i = 0; i < 7; i++) {
		var tr = document.createElement("tr");
		for (var j = 0; j < 7; j++) {
			var td = document.createElement("td");
			tr.appendChild(td);// td追加到tr中
			if (i == 0) { // 是否是第一行
				td.innerHTML = week[j];
				td.style.fontWeight = "bold";// 字体加粗
			} else {
				td.title = d.getFullYear() + "-" + (d.getMonth() + 1) + "-"
						+ d.getDate();

				if (j == 6 || j == 0) {
					td.style.color = "red";
				}

				if (d.getMonth() != month) {
					td.style.color = "gray";
				}

				td.style.cursor = "pointer";// 设置鼠标
				td.onmouseover = function() {
					color = this.style.backgroundColor;
					this.style.backgroundColor = "aqua";

				}

				td.onmouseout = function() {
					this.style.backgroundColor = color;
				}

				td.onclick = function() {
					//var inputObj = document.getElementById("xxxxxx");
					var inputObj = inputdateObj;
					inputObj.value = this.title;
					if (outDiv != null) {
						document.body.removeChild(outDiv);
						outDiv = null;
					}
				}

				if (time.getFullYear() == d.getFullYear()
						&& time.getMonth() == d.getMonth()
						&& time.getDate() == d.getDate()) {
					td.style.backgroundColor = "green";
					td.style.fontWeight = "bold";
					td.style.textDecoration = "underline";
				}

				td.innerHTML = d.getDate();
				d.setDate(d.getDate() + 1);// 每循环一次日期加1天
			}
		}
		table.appendChild(tr);// tr追加到table中
	}
	outDiv.appendChild(table);// table追加到outDiv中
	
	var top = $("#exchange_time_str").offset().top;
	var left = $("#exchange_time_str").offset().left;
	//alert(left+"    "+top);
	
	$(outDiv).css("position","absolute");
	$(outDiv).css("top",top);
	$(outDiv).css("left",left);
	$(outDiv).css("zIndex","99999999999");
}

<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>搜索引擎</title>
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		<script src="${base.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
		<script src="${base.contextPath}/static/bootstrap-3.3.7-dist/js/npm.js"></script>
		<link href="${base.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap-theme.css" rel="stylesheet" />
		<link href="${base.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" />
		<style type="text/css">
			* {
				margin: 0;
				padding: 0;
			}
		</style>
	</head>

	<body>
		<div>
			<!--描述：每个页面的头部 -------------------------------------------------->
			<div>
				<div style="width: 1200px;height: 25px;margin: auto;padding:6px;">
					<p style='font-size: 14px;'>
						<span style='color: orangered;'>北京</span>【切换城市】&nbsp;&nbsp;&nbsp; ☀&nbsp; ️
						<span style='color: cadetblue;'>晴&nbsp;<span style='font-size: 13px;'}>15～20</span></span> ️
					</p>
				</div>
				<hr />
			</div>
			<!--------------------------------------------------------------------------->
			<div style='min-height: 1000px;width: 1200px;margin: auto;' }>

				<!-- 第一个row开始 -->
				<div class="row">
					<div class="col-lg-1">
					</div>
					<!-- 选择职位 -->
					<div class="col-lg-3">
						<div class="input-group">
							<input type="text" class="form-control" aria-label="..." placeholder="选择职位类别">
							<div class="input-group-btn">
								<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <span class="caret"></span></button>
								<ul class="dropdown-menu dropdown-menu-right">
									<li><a href="#">程序员</a></li>
									<li><a href="#">健身教练</a></li>
									<li><a href="#">教师</a></li>
									<!-- 这是搜索下拉框里的横线 横线下可放热门搜索 -->
									<li role="separator" class="divider"></li>
									<li><a href="#">老师</a></li>
								</ul>
							</div>
						</div>
					</div>

					<!-- 选择行业 -->
					<div class="col-lg-3">
						<div class="input-group">
							<input type="text" class="form-control" aria-label="..." placeholder="选择行业类别">
							<div class="input-group-btn">
								<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <span class="caret"></span></button>
								<ul class="dropdown-menu dropdown-menu-right">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="#">Separated link</a></li>
								</ul>
							</div>
						</div>
					</div>

					<!-- 搜索 -->
					<div class="col-lg-4">
						<div class="input-group">
							<input type="text" class="form-control" placeholder="请输入..." aria-describedby="basic-addon2">
							<span class="input-group-addon" id="basic-addon2">搜索</span>
						</div>
					</div>
				</div>
				<!-- 第一个row结束 -->

				<!-- 第2️个row开始 -->
				<br />
				<div class="row">
					<div class="col-lg-2">
					</div>

					<!-- 选择地点 -->
					<div class="col-lg-2">
						<div class="input-group">
							<input type="text" class="form-control" aria-label="..." placeholder="全北京">
							<div class="input-group-btn">
								<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <span class="caret"></span></button>
								<ul class="dropdown-menu dropdown-menu-right">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="#">Separated link</a></li>
								</ul>
							</div>
						</div>
					</div>

					<!-- 薪资 -->
					<div class="col-lg-2">
						<div class="input-group">
							<input type="text" class="form-control" aria-label="..." placeholder="薪资">
							<div class="input-group-btn">
								<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <span class="caret"></span></button>
								<ul class="dropdown-menu dropdown-menu-right">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="#">Separated link</a></li>
								</ul>
							</div>
						</div>
					</div>

					<!-- 学历 -->
					<div class="col-lg-2">
						<div class="input-group">
							<input type="text" class="form-control" aria-label="..." placeholder="学历">
							<div class="input-group-btn">
								<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <span class="caret"></span></button>
								<ul class="dropdown-menu dropdown-menu-right">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="#">Separated link</a></li>
								</ul>
							</div>
						</div>
					</div>

					<!-- 工作经历 -->
					<div class="col-lg-2">
						<div class="input-group">
							<input type="text" class="form-control" aria-label="..." placeholder="工作经历">
							<div class="input-group-btn">
								<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <span class="caret"></span></button>
								<ul class="dropdown-menu dropdown-menu-right">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="#">Separated link</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<!-- 第2个row结束 -->
				<br />
				<br />
				<br />
				<div style="height: 300px;background-color: antiquewhite;margin: auto;">
					<div style="width: 300px;margin: auto;" }>
						<p style="font-size: 20px;font-weight: bold;line-height: 300px;">这里将会有个比较炫的东西</p>
					</div>
				</div>
			</div>

			<!--描述：每个页面的脚部 ------------------------------------------------------>
			<div style="width: 1200px;height: 25px;margin: auto;padding:6px;">
				<hr />
				<div style='width: 180px;font-size: 14px;margin: auto;'>
					<p><span style='color: #333399'>@郭润和</span>&nbsp;搜索引擎&nbsp;毕业设计</p>️
				</div>
			</div>
			<!--------------------------------------------------------------------------->

		</div>
	</body>

</html>
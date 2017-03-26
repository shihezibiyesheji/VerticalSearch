<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8" />
	<title>搜索引擎</title>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<script src="${base.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
	<link href="${base.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap-theme.css" rel="stylesheet" />
	<link href="${base.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" />
	<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>

	<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,600,200italic,600italic&subset=latin,vietnamese' rel='stylesheet'
	 type='text/css'>

	<script src="http://phuonghuynh.github.io/js/bower_components/jquery/dist/jquery.min.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/d3/d3.min.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/d3-transform/src/d3-transform.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/cafej/src/extarray.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/cafej/src/misc.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/cafej/src/micro-observer.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/microplugin/src/microplugin.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/bubble-chart/src/bubble-chart.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/bubble-chart/src/plugins/central-click/central-click.js"></script>
	<script src="http://phuonghuynh.github.io/js/bower_components/bubble-chart/src/plugins/lines/lines.js"></script>
	<script src="${base.contextPath}/static/bootstrap-3.3.7-dist/js/index.js"></script>

	<script>
		var app = angular.module("myData", []);
		app.controller('copy', function ($scope) {
			$scope.jobCategory = [{
				id: '1',
				value: '教师'
			}, {
				id: '2',
				value: '程序员'
			}, {
				id: '3',
				value: '工程师'
			}];
		});
	</script>

	<style>
		* {
			margin: 0;
			padding: 0;
		}
		
		.bubbleChart {
			min-width: 100px;
			max-width: 700px;
			height: 700px;
			margin: 0 auto;
		}
		
		.bubbleChart svg {
			background: #F2F2F2;
		}
	</style>

</head>

<body>

	<div ng-app="myData">
		<div>
			<!--描述：每个页面的头部 ************-->
			<div>
				<div style="width: 1200px;height: 25px;margin: auto;padding:6px;">

					<div class="row">
						<div class="col-lg-1">
							<p>搜索引擎</p>
						</div>

						<div class="col-lg-5">
							<iframe width="450" scrolling="no" height="18" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=1&icon=1&wind=0&num=2"></iframe>
						</div>

						<div class="col-lg-5">
							<a href="${base.contextPath}/WEB-INF/view/SearchResult.ftl"> <button>测试按钮--搜索结果页</button></a>
						</div>
					</div>

				</div>
				<hr />
			</div>
			<!--********************************-->
			<div style='height: 120px;width: 1200px;margin: auto' }>

				<!--第一个row开始 -->
				<div class="row">
					<div class="col-lg-1">
					</div>
					<!-- 选择职位 -->
					<div class="col-lg-3">
						<div class="input-group">
							<input type="text" class="form-control" aria-label="..." placeholder="选择职位类别">
							<div class="input-group-btn">
								<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <span class="caret"></span></button>
								<ul class="dropdown-menu dropdown-menu-right" ng-controller="copy">
									<!--职位类别的显示-->
									<li for="" ng-repeat="item in jobCategory"><a href="#">{{item.value}}&nbsp;</a></li>
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
			</div>
			<!-- 第2个row结束 -->

			<!-- 中间开始 -->

			<div style="min-height: 300px;margin: auto;">
				<div style="width: 1200px;margin: auto;" }>
					<div style="background: #F2F2F2">
						<div class="bubbleChart" />
					</div>
				</div>
			</div>
			<!-- 中间结束 -->



			<!--描述：每个页面的脚部 **************-->
			<div style="width: 1200px;height: 25px;margin: auto;padding:6px;">
				<hr />
				<div style='width: 180px;font-size: 14px;margin: auto;'>
					<p>
						<a href="https://user.qzone.qq.com/1031778303/infocenter?ptsig=6tGcnT*5hLdAql-GuoSgXYjnL9PwD5oz6i3yFS0ruqY_" style='color: #333399'>
						@郭润和
						</a> &nbsp;搜索引擎&nbsp;毕业设计
					</p>️
				</div>
			</div>
			<!--********************************-->



		</div>
</body>

</html>
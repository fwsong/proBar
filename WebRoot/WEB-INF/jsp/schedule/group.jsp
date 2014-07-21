<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
  	<%@ include file="../gloab.jsp" %>
  	<%@ include file="../head.jsp" %>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="<%=httpServer%>css/schedule/schedule.css">
	<link rel="stylesheet" type="text/css" href="<%=httpServer%>css/schedule/group.css">

  </head>
  
  <body background="<%=httpServer%>images/background.jpg">
  	<%@ include file="../site-nav.jsp" %>
   	<div class="group_sub_nav group_sub_nav_ad">
   		<ul>
   			<li class="group_sub_nav_adli"><a href="http://www.baidu.com" target="_blank"><img src="<%=httpServer%>images/group/somnopro_ad.png"/></a></li>
   			<li><a href="<%=httpServer%>schedule/group">小组赛程</a></li>
   			<li><a href="<%=httpServer%>schedule/playoffs">淘汰赛对阵</a></li>
   			<li><a href="<%=httpServer%>schedule/calendar">赛事日历/电视直播</a></li>
   			<li><a href="<%=httpServer%>schedule/richteam">豪门直播</a></li>
   		</ul>
   	</div>
   	
   	<div class="pbody">
   		<div class="sect_group sect">
   			<div class="col_lm">
   				<div class="mod_sch_group mod" style="-webkit-transform:translated3d(0px,-0.00000105px,0px);">
   					<div class="wc_sch sch_red">
   						<div class="wctable_sch_title">
   							<h2><em>A</em>组</h2>
   						</div>
   						<table class="wctable wctable_sch">
   							<colgroup>
   								<col class="tb_block"/>
   								<col class="tb_col1"/>
   								<col class="tb_col2"/>
   								<col class="tb_col3"/>
   								<col class="tb_col4"/>
   								<col class="tb_col5"/>
   								<col class="tb_col6"/>
   								<col class="tb_col7"/>
   							</colgroup>
   							<thead>
   								<tr>
   									<th></th>
   									<th></th>
   									<th>时间</th>
   									<th>编号</th>
   									<th>对阵</th>
   									<th>城市</th>
   									<th>电视直播</th>
   									<th>其他</th>
   								</tr>
   							</thead>
   							<tbody>
   								<tr class="tr01">
   									<td class="tb_block"></td>
   									<td class="tb_col1">1场</td>
   									<td>06月13日 星期五04:00</td>
   									<td>A1-A4</td>
   									<td>巴西 3-1 克罗地亚</td>
   									<td>圣保罗</td>
   									<td>CCTV5</td>
   									<td><a href="">战报</a></td>
   								</tr>
   								<tr class="tr01">
   									<td class="tb_block"></td>
   									<td class="tb_col1">2场</td>
   									<td>06月14日 星期六00:00</td>
   									<td>A3-A2</td>
   									<td>墨西哥 1-0 喀麦隆</td>
   									<td>纳塔尔</td>
   									<td>CCTV5</td>
   									<td><a href="">战报</a></td>
   								</tr>
   							</tbody>
   						</table>
   					</div>
   				</div>
   			</div>
   			<div class="col_rm">
   				<div class="mod_points_group mod_points_groupa" style="-webkit-transform:translated3d(0px,0px,0px);">
   					<div class="mod_hd wc_title_a">
   						<h2><em>A</em>组</h2>
   						<a href="">详情
   							<span class="ico_trag05"></span>
   						</a>
   					</div>
   					<div class="mod_bd">
   						<table class="wctable wctable_points">
   							<colgroup>
   								<col class="tb_block1">
   								<col class="tb_col2">
   								<col class="tb_col3">
   								<col class="tb_col4">
   								<col class="tb_block2">
   							</colgroup>
   							<thead>
   								<tr>
   									<th class="tb_block1"></th>
   									<th>排名</th>
   									<th>球队</th>
   									<th>积分</th>
   									<th>胜/平/负</th>
   								</tr>
   							</thead>
   							<tbody>
   								<tr>
   									<td class="tb_block1"></td>
   									<td class="tb_col2"><span class="rank_num rank_top">1</span></td>
   									<td class="tb_col3"><a href="">巴西</a></td>
   									<td class="tb_col4">7</td>
   									<td class="tb_block2">2|1|0</td>
   								</tr>
   							</tbody>
   						</table>
   					</div>
   				</div>
   			</div>
   		</div>
   	</div>
  </body>
</html>

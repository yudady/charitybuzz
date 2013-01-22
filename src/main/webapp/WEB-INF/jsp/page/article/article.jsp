<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link type="text/css" rel="stylesheet" href='<c:url value="/resources/css/article.css"/>'/>
<script type="text/javascript" src='<c:url value="/resources/js/page/article.js" />'></script>
</head>
<body>
	<div id="HomePageOnly-top">
		<div id="sidebar"></div>
		
		<div id="articleDetail">


					<div id="photo" style="height: auto;">
						<div class="time-tag">
							<div class="rotate-clock">
								<span class="clock-triangle"> <b> <i
										class="icon-time"
										style="margin: 0 !important; padding: 0 !important;"></i> 17
										days
								</b>
								</span>
							</div>
							<!-- rotate-clock -->
						</div>
						<!-- time-tag -->
						<a id="photo-zoomer" class="" title="" href="#"> <img
							id="photo-zoom" class="smalla zoomdat"
							src="https://s3.amazonaws.com/images.charitybuzz.com/images/85732/detail.jpeg?1358201435"
							alt="LotPhoto" /></a>
					</div>







			<!-- ================ main content ========================= -->
			<div id="mainRight">
				<div id="bidding_left_column">
					<div id="lot-detail-tab-wrapper" class="clearfix">
						<ul class="nav">
							<li class="nav-one"><a class="current" href="#lotDetails">Lot
									Details </a></li>
							<li class="nav-two"><a href="#legalTerms">Legal Terms</a></li>
							<li class="nav-three"><a href="#shipping">Shipping</a></li>
						</ul>
						<div class="clearfix"></div>
						<div class="list-wrap">
							<ul id="lotDetails" class="lotDetailTab">
								<li>
									<h1>Lot Details</h1>
									<p class="expandme">
										Howard fans rejoice, this is your unbelievable chance for you
										and a guest to see <a target="_blank"
											href="http://www.howardstern.com/"> <i>The Howard
												Stern Show</i>
										</a> and meet the staff in person!
									</p>
									<p>This unforgettable experience includes the opportunity
										to meet the staff, watch the last hour of the show live and
										then also watch the ‘Wrap Up Show’ in studio, uncensored
										broadcast of The Howard Stern Show from the SIRIUS XM Radio
										Studio in New York City. Put your headset on and take part as
										broadcast history unfolds before your very eyes with your
										favorite Howard Stern Show regulars: Robin Quivers, Fred
										Norris, Gary "Baba Booey" Dell'Abate, and more.</p>
									<p>
										The net proceeds for this item benefit <a target="_blank"
											href="http://www.gardenofdreamsfoundation.org/">The
											Garden of Dreams Foundation</a> .
									</p>
								</li>
							</ul>
							<ul id="legalTerms" class="hide lotDetailTab"
								style="position: relative; top: 0px; left: 0px; display: none;">
								<li>
									<h1>Legal Terms</h1>
									<p class="excerptMe"></p>
									<ul>
										<li>To be scheduled at a mutually convenient date.</li>
										<li>Valid for two people over the age of 18.</li>
										<li>Visit will be for the last hour of the show and the
											wrap up show.</li>
										<li>Must be redeemed within one year of the close of the
											auction.</li>
										<li>Pending the Howard Stern Show schedule and based on
											availability. Certain blackout days may apply.</li>
										<li>Meeting specific staff members is based on their
											availability on the days of the show.</li>
										<li>Interaction on the air is not guaranteed.</li>
									</ul> Cannot be returned or exchanged. Travel and accommodations are
									not included. Winning bidder and guest(s) subject to security
									screening. We expect all winning bidders and their guests to
									conduct themselves appropriately when attending an experience
									won at Charitybuzz. Polite manners and respect for the generous
									donor and adherence to any rules or parameters are a must.
									<p></p>
								</li>
							</ul>
							<ul id="shipping" class="hide lotDetailTab excerptMe"
								style="position: relative; top: 0px; left: 0px; display: none;">
								<li>
									<h1>Shipping</h1>
									<p class="excerptMe">The minimum shipping, handling and
										applicable insurance for this item is $9.95. Additional
										shipping charges may apply based upon the location of the
										winner. Hard copies of tickets, travel certificates and
										merchandise are shipped via FedEx or professional shipping
										service. Detailed redemption information for non-tangible
										items will be emailed to the winning bidder.</p>
								</li>
							</ul>
						</div>
						<!-- END List Wrap -->
					</div>
					<!-- END lot-detail-tab-wrapper -->
				</div>
			</div>
			<!-- end main -->

















		</div>
		<div id="bidDetail">
			bidDetail
		</div>
	</div>
</body>
</html>
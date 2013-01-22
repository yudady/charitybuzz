<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link type="text/css" rel="stylesheet"
	href='<c:url value="/resources/css/article.css"/>' />
<script type="text/javascript"
	src='<c:url value="/resources/js/page/article.js" />'></script>
</head>
<body>
	<div id="HomePageOnly-top">
		<div id="sidebar"></div>
<!-- bidding_left_column -->
		<div id="bidding_left_column">
			<div id="photo" style="height: auto;">
				<div class="time-tag">
					<div class="rotate-clock">
						<span class="clock-triangle"> <b> <i class="icon-time"
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



			<div id="tabs">
				<ul>
					<li><a href="#lotDetails">Lot Details </a></li>
					<li><a href="#legalTerms">Legal Terms</a></li>
					<li><a href="#shipping">Shipping</a></li>
				</ul>
				
				<div id="lotDetails">${article.lotDetails}</div>
				<div id="legalTerms">${article.legalTerms}</div>
				<div id="shipping">${article.shipping}</div>
			</div>
		</div>
<!-- bidding_left_column -->
<!-- bidding_left_column -->
		<div id="bidding_right_column">
			<div id="bidding_right_column">
				<h2>
					Sit In on <i>The Howard Stern Show</i> in NYC and Meet the Staff!
				</h2>
				<div class="bread_crumbs">
					<a href="/"> <i class="icon-home"> <span
							class="hideThis504Text">Home</span>
					</i>
					</a> » <a href="/categories/14/catalog_items">Celebrity</a>
				</div>
				<div id="bidInfo">
					<div id="placeBid">
						<div style="height: 10px;"></div>
						<div id="currentBidWrap">
							<div id="currentBid">
								Current Bid: <span id="currentPrice">$5,250</span> <span
									id="bidcounter"> ( <a id="BiddingIncrementsPop"
									href="/catalog_items/314327/bids">2 bids</a> )
								</span>
							</div>
							<div class="clearfix"></div>
							<div id="placedBy">
								placed by: <b>jaimervelasco</b>
							</div>
							<div class="estimated_price">
								Estimated Value: <b> $25,000 </b>
							</div>
						</div>
						<div id="timeLeft">
							17 days left to bid
							<div id="closingTime">
								Fri, 8 Feb 1:12PM EST <a class="showHints icon-question-sign"
									href="#closingTimePop"> <span class="hideThis504Text">What's
										this?</span>
								</a>
							</div>
						</div>
						<form id="new_bid" class="clearfix" method="post"
							action="https://www.charitybuzz.com/catalog_items/314327/bids"
							accept-charset="UTF-8">
							<div style="margin: 0; padding: 0; display: inline">
								<input type="hidden" value="✓" name="utf8" /> <input
									type="hidden"
									value="1mhRLTV5BE5YtSr77p9R5JrcKI/KrqlPTWLMtsSlNKg="
									name="authenticity_token" />
							</div>
							<!-- ============== CURRENCY CONVERTER CODE begin =============== -->
							<div id="currencyConverter">
								<a id="link-currency" href="#"> $ <small>▾</small>
								</a>
								<div id="popup-currency">
									<h4>Conversions Approximate</h4>
									<table cellspacing="0" cellpadding="0" border="0">
										<thead>
											<tr>
												<th class="country"></th>
												<th class="current">current bid</th>
												<th class="minNext">min next bid</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td class="country"><img width="21" height="13"
													src="http://assets2.charitybuzz.com/assets/0e1feffb2/images/lot_detail/flag-usd.png"
													alt="USD" /> USD</td>
												<td class="current">5,250</td>
												<td class="minNext">5,750</td>
											</tr>
											<tr>
												<td class="country"><img width="21" height="13"
													src="http://assets2.charitybuzz.com/assets/dc8326984/images/lot_detail/flag-eur.png"
													alt="EUR" /> EUR</td>
												<td class="current">3,933.38</td>
												<td class="minNext">4,307.99</td>
											</tr>
											<tr>
												<td class="country"><img width="21" height="13"
													src="http://assets2.charitybuzz.com/assets/b2d4a6216/images/lot_detail/flag-gbp.png"
													alt="GBP" /> GBP</td>
												<td class="current">3,309.54</td>
												<td class="minNext">3,624.73</td>
											</tr>
											<tr>
												<td class="country"><img width="21" height="14"
													src="http://assets2.charitybuzz.com/assets/a0086ec5a/images/lot_detail/flag-chf.png"
													alt="CHF" /> CHF</td>
												<td class="current">4,875.68</td>
												<td class="minNext">5,340.03</td>
											</tr>
											<tr>
												<td class="country"><img width="21" height="13"
													src="http://assets2.charitybuzz.com/assets/12bb4b56e/images/lot_detail/flag-jpy.png"
													alt="JPY" /> JPY</td>
												<td class="current">465,833</td>
												<td class="minNext">510,198</td>
											</tr>
											<tr>
												<td class="country"><img width="21" height="14"
													src="http://assets2.charitybuzz.com/assets/58b3ecd7f/images/lot_detail/flag-hkd.png"
													alt="HKD" /> HKD</td>
												<td class="current">40,703.51</td>
												<td class="minNext">44,580.04</td>
											</tr>
											<tr>
												<td class="country"><img width="21" height="15"
													src="http://assets2.charitybuzz.com/assets/4dc1ad336/images/lot_detail/flag-rub.png"
													alt="RUB" /> RUB</td>
												<td class="current">158,662.88</td>
												<td class="minNext">173,773.63</td>
											</tr>
											<tr>
												<td class="country"><img width="21" height="13"
													src="http://assets2.charitybuzz.com/assets/b83f5d43a/images/lot_detail/flag-cny.png"
													alt="CNY" /> CNY</td>
												<td class="current">32,680.20</td>
												<td class="minNext">35,792.60</td>
											</tr>
										</tbody>
									</table>
								</div>
								<!-- /popup-currency -->
							</div>
							<!-- /currencyConverter -->
							<input id="bid_amount" type="text" size="30" name="bid[amount]" />
							<input id="ref" type="hidden" value="14" name="ref" />
							<button id="bid_submit" class="submit cssButton" type="submit"
								name="commit">Bid now</button>
						</form>
						<div id="inlineErrors" style="font-size: 11px;"></div>
						<div id="minimumBid" style="font-size: 11px;">
							you must bid at least <span id="minimumBidAmount">$5,750</span> <a
								class="showHints icon-question-sign"
								href="#maxBidAndBidIncrementsPop"> <span
								class="hideThis504Text">What's this?</span>
							</a>
						</div>
					</div>
					<div class="watch-question-grid clearfix removeBottomborder">
						<div class="benifit-full-width">
							<i class="icon-heart"></i> Proceeds Benefit: <a class="turnred"
								target="_blank" href="http://www.gardenofdreamsfoundation.org/">The
								Garden of Dreams Foundation</a>
							<!-- = link_to "<i class='icon-arrow-down'>&nbsp;</i>Proceeds Info".html_safe, "#Slide", :class => "toProceedsDiv" -->
							<!-- .bidCount -->
							<!-- -->
							<!-- %div.proceeds -->
						</div>
					</div>
					<div class="watch-question-grid clearfix">
						<a class="wqgLeft ie7-hack-for-first-child-icon"
							href="/catalog_items/314327/toggle_watch"> <i
							class="icon-eye-open"></i> Watch This Item
						</a> <a class="wqgRight" title="Ask a question about this item"
							href="/contacts/new?lot=314327"> <i class="icon-comments-alt">
						</i> Ask a Question
						</a>
					</div>
					<!-- #watchButton.clearfix -->
					<!-- = watch_lot_link @lot, @watching -->
					<!-- - if still_time_to_receive_last_cron_notification? -->
					<!-- = link_to t('whats_this'), "#watchLotPop", :class => "showHints icon-question-sign ie7-hack-for-first-child-icon" -->
					<div id="more-details">
						<a class="toggle"> <i
							class="icon-chevron-right ie7-hack-for-first-child-icon"></i>
							More Details
						</a>
						<dl class="clearfix" style="height: 80px; display: none;">
							<dt class="noBold">Lot Number:</dt>
							<dd># 314327</dd>
							<dt class="noBold">Estimated Value:</dt>
							<dd>$25,000</dd>
							<dt class="noBold">Open Date</dt>
							<dd>Wed, 16 Jan 2013 1:00:00 PM EST</dd>
							<dt class="noBold">Close Date:</dt>
							<dd>Fri, 8 Feb 2013 1:12:00 PM EST</dd>
						</dl>
					</div>
				</div>
			</div>
		</div>
<!-- bidding_left_column -->
	</div>
</body>
</html>
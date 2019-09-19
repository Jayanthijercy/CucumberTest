$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/pom.feature");
formatter.feature({
  "name": "Work on Snapdeal",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add the prodcut to cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch the browser and go to snapdeal website",
  "keyword": "Given "
});
formatter.match({
  "location": "Logics.launch_the_browser_and_go_to_snapdeal_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for hair dryer and click on it then click on add to cart option",
  "keyword": "When "
});
formatter.match({
  "location": "Logics.search_for_hair_dryer_and_click_on_it_then_click_on_add_to_cart_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check url contains addToCart",
  "keyword": "Then "
});
formatter.match({
  "location": "Logics.check_url_contains_addToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
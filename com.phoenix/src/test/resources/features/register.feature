@register @endtoend @smoke @regression @login
Feature: Test Environment Retail Page

Background:
    Given user is on test environment homepage
    When user click on myaccount button
#Instead of Scenario Outline and example keyword, we are using cucumber datatable
#We enter our test data right after the steps where it says (user enter information)
#We can use list of list or list of map to access the data from cucumber datatable
#if we use list of list, then we don't need title, we just type in the values separated by vartical pipes
#if we use list of map, then we first type the titles and then values in the next line   
Scenario: Register with Test Environment Webpage
		And user click on register button
		And user fill registeration form with information below
		|firstname|lastname|email|telephone|password|confirmPassword|
		|John|Colunga|johncolunga2388@gmail.com|4024443434|johncolunga33399|johncolunga33399|
		And user click on agree to terms checkbox
		And user click on continue button
		  

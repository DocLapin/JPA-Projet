'use strict';

var app = angular.module('app', [ 'ngRoute', 'rentControllers' ]);

app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/profil', {
		templateUrl : 'partials/menu.html'
	}).when('/profil/listeProfil', {
		templateUrl : 'partials/listerProfil.html',
		controller : 'rentController'
	}).when('/profil/modifierProfil', {
		templateUrl : 'partials/modifierProfil.html',
		controller : 'modifierController'
	}).otherwise({
		redirectTo : '/'
	});
} ]);

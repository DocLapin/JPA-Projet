'use strict';

var app = angular.module('GestionProfil', [ 'ngRoute', 'rentControllers' ]);

app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/gestionProfil', {
		templateUrl : 'partials/menu.html'
	}).when('/gestionProfil/listeProfil', {
		templateUrl : 'partials/listerProfil.html',
		controller : 'rentController'
	}).when('/gestionProfil/modifierProfil', {
		templateUrl : 'partials/modifierProfil.html',
		controller : 'modifierController'
	}).when('/gestionProfil/creerProfil', {
		templateUrl : 'partials/creerProfil.html',
		controller : 'creerController'
	}).otherwise({
		redirectTo : '/gestionProfil'
	});
} ]);

'use strict';

var rentControllers = angular.module('rentControllers', []);

rentControllers.controller("rentController", function($scope,$http,$routeParams) {

	$http.get('http://localhost:8080/profil').
	  success(function(data, status, headers, config) {
	  	$scope.listeProfil = data;
	  	$scope.selected = data[0];
	  }).
	  error(function(data, status, headers, config) {
		  alert("Erreur http get : " + status);
	  });
	
	$scope.choisirProfil = function(selected) {
		
		$http({
		    method: 'POST',
		    url: 'http://localhost:8080/profil',
		    data: selected,
		    headers: {'Content-Type': 'application/json'}
		}).
		error(function(data, status, headers, config) {
			alert("Erreur http get : " + status);
		});
	};     
});

rentControllers.controller("modifierController", function($scope,$http,$routeParams) {

	$http.get('http://localhost:8080/profil/11AA22').
	  success(function(data, status, headers, config) {
	  	$scope.profil = data;
	  }).
	  error(function(data, status, headers, config) {
		  alert("Erreur http get : " + status);
	  });
	
	$scope.modifierProfil = function(profil) {
		$http({
		    method: 'PUT',
		    url: 'http://localhost:8080/profil',
		    data: profil,
		    headers: {'Content-Type': 'application/json'}
		}).
		error(function(data, status, headers, config) {
			alert("Erreur http get : " + status);
		});
	};
});

rentControllers.controller("creerController", function($scope,$http,$routeParams) {

	$scope.creerProfil = function(selected) {
		
		$http({
		    method: 'POST',
		    url: 'http://localhost:8080/profil',
		    data: selected,
		    headers: {'Content-Type': 'application/json'}
		}).
		error(function(data, status, headers, config) {
			alert("Erreur http get : " + status);
		});
	};     
});
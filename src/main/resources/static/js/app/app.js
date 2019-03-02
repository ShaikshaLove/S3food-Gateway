angular.module("myapp",["ProductApp","user","ngRoute"]);


angular.module("myapp").config(function($httpProvider,$routeProvider){
	$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

	$routeProvider.when("/productRegister",{

		templateUrl:"js/app/product/html/ProductRegister.html",
		controller:"ProductRegisterCtrl"

	}
	);

	$routeProvider.when("/products",
			{
		templateUrl:"js/app/product/html/products.html",
		controller:"ProductListCtrl"
			});

	$routeProvider.when("/user-login",
			{
		templateUrl:"js/app/user/html/user-login.html",
		controller:"UserCtrl"
			});

	$routeProvider.when("/user-registration",
			{
		templateUrl:"js/app/user/html/user-registration.html",
		controller:"UserRegisterCtrl"
			});

	$routeProvider.when("/home",
			{
		templateUrl:"home.html",
		controller:"HomeCtrl"
			});
	$routeProvider.otherwise(
			{
				templateUrl:"home.html",
				controller:"HomeCtrl"
			});
});


angular.module("myapp").controller("BodyCtrl",function($scope,$http){

	$scope.user={};
	$scope.hideHyperLinks=true;
	$http.get("/myaccount").then(function(response){
		$scope.user=response.data;
		console.log(response.data)
	},function(error){
		$scope.user=error.data;
	});
	
	$scope.logout=function(){
		$scope.hideHyperLinks=false;
	}
	
	
});

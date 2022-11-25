var app = angular.module('DemoApp',[]);
app.controller('DemoCtrl', ['$scope',function($scope,$routeParams){
$scope.price="";
$scope.quantity="";
$scope.product = () => {
	return parseInt($scope.price) * parseInt($scope.quantity);
}
}
]);
var myApp=angular.module("Module",[]);
var myController=function($scope,$routeParams){
$scope.message="CSE branch, MIT Manipal";
}
myApp.controller("myController",['$scope',myController]);
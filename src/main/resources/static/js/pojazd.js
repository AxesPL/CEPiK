angular.module('app', []).controller('pojazdController', function ($http) {
    var vm = this;
    console.log("wywolanie !");
    vm.addPojazd = function (pojazd) {
        console.log("wywolanie !");
        $http({
            method: 'POST',
            url: 'http://localhost:8080/cepik/pojazd',
            data: pojazd
        }).then(function success(response) {
            vm.pojazd = {};
        }, function error(response) {
            console.log('Data not saved ' + product);
        });
    }
});
console.log("wywolanie !");
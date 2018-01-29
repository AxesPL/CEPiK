angular.module('app', []).controller('pojazdController', function ($http) {
    var vm = this;
    console.log("wywolanie !angular");
    vm.addPojazd = function (pojazd) {
        console.log("wywolanie http!");
        $http({
            method: 'POST',
            url: 'http://localhost:8080/cepik/pojazd',
            data: pojazd
        }).then(function success(response) {
            vm.pojazd = {};
        }, function error(response) {
            console.log('Data not saved ' + pojazd);
        });
    }
});
console.log("wywolanie js !");
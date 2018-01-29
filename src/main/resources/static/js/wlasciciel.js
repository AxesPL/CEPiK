angular.module('app', []).controller('wlascicielController', function ($http) {
    var vm = this;
    console.log("wywolanie !angular");
    vm.addWlasciciel = function (wlasciciel) {
        console.log("wywolanie http!");
        $http({
            method: 'POST',
            url: 'http://localhost:8080/cepik/wlasciciel',
            data: wlasciciel
        }).then(function success(response) {
            vm.pojazd = {};
        }, function error(response) {
            console.log('Data not saved ' + wlasciciel);
        });
    }
});
console.log("wywolanie js !");


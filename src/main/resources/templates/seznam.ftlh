[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Vizitkovník</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
<div class="seznam">
    [#list vizitky as vizitka]
    <a href="/detail">
        <div class="vizitka">
            <div class="jmeno">${vizitka.jmeno}</div>
            <div class="firma">${vizitka.firma}</div>
            <div class="udaje">
                <div class="adresa">
                    <div>${vizitka.ulice}</div>
                    <div><span>${vizitka.obecPsc}</span></div>
                </div>
                <div class="kontakty">
                    <div><i class="las la-at"></i> <span>${empty vizitka.email ? "Není k dispozici" : vizitka.email}</span></div>
                    <div><i class="las la-phone-alt"></i> <span>${empty vizitka.telefon ? "Není k dispozici" : vizitka.telefon}</span></div>
                    <div><i class="las la-globe"></i> <span>${empty vizitka.web ? "Není k dispozici" : vizitka.web}</span></div>
                </div>
            </div>

         </div>
    </a>


    [/#list]
</div>
</body>
</html>

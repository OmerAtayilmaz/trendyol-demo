# Trendyol Group A.Ş LTD ŞTI

## Before running project
    1. Download project
    2. Download docker

## Runnig project;
in the resource files;
`docker-compose -f docker-compose.yml up -d`
bu komut satırı docker-compose adlı dosyadaki bilgilerinizi barındıran containeri ayağa kaldırır.
Eğer image yoksa önce gerekli imageyi indirir sonra ayağa kaldırır.


Docker DB'sinin şifresini-portunu vs. belirleyip ayağa kaldırmak;

docker run --name postgres -e POSTGRES_PASSWORD=root -d -p 5432:5432 postgres

##Tables
1- you can find the tables in entity folder.
2- the table relations at the bottom of the entity


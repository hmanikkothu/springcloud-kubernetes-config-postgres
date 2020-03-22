# springcloud-kubernetes-config-postgres

## OpenShift

## PostgreSQL setup

### Allow remote access 
edit postgresql.conf
``` 
vim /usr/local/var/postgres/postgresql.conf
```
set listen_addresses to '*'
```
listen_addresses = '*'
```
### Update pg_hba.conf to allow access from the cluster
```
vim /usr/local/var/postgres/pg_hba.conf

host    all             all             192.168.64.5/32         trust

# 192.168.64.5 is the cluster IP
```

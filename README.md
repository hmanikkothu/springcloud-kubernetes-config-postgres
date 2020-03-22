# springcloud-kubernetes-config-postgres

## OpenShift

#### Create ServiceAccount, Role, RoleBinding
```
oc create sa-role-rb.yml
```
#### Create App Service
```
oc create service.yml
```
#### Create Route
```
oc create route.yml
```
#### Create external DB Service and Endpoint
```
oc create db-service.yml
oc create db-endpoint.yml
```
#### Create DeploymentConfig
```
oc create deploymentconfig.yml
```

## PostgreSQL setup

### Allow access from the cluster 

Edit postgresql.conf
``` 
vim /usr/local/var/postgres/postgresql.conf
```
set listen_addresses to '*'
```
listen_addresses = '*'
```

Update pg_hba.conf to allow access from the cluster
```
vim /usr/local/var/postgres/pg_hba.conf

host    all             all             192.168.64.5/32         trust

# 192.168.64.5 is the cluster IP
```

Restart postgres
```
brew services restart postgresql
```

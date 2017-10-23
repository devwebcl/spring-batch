# poc-etl-nd-cd
Proof of Concept for devwebish migration to (INTL) platform.
Currently this is MVP for this migration.

<p>This migration is based on our domain described below:

# domain

The Domain identification can be summarized by acronym DUO, which is our canonical tuple:

* Deals
* Users
* Orders

# software stack
* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Spring Batch 3.0.7](http://docs.spring.io/spring-batch/reference/html/domain.html)

# compile
```
mvn clean package
```

# execute

i.e.:

```
mvn exec:java -DjobName=orders
```

This task executes class cl.devweb.AppMigration.

Possible Values:
* cities
* deals
* orders
* users

Other possible parameters:
* country (values: cl, co, pe, mx)
* limit (value > 0)

i.e <br>
maven:
```
mvn exec:java -DjobName=users -Dcountry=co -Dlimit=500
```

Command line:
```
java -DjobName=users -cp spring-batch-devwebish-migration.jar:libs/* cl.devweb.AppMigration
```


# config

`migration.properties` must have custom property: password
and `database.xml` with encrypted values.



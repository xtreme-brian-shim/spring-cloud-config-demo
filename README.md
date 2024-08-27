# spring-cloud-config-demo
Demo showing the basics of Spring Cloud Config

#### This sets up your TAS/TPCF config server. It assumes that your config files are located at <this-repository-url> in the branch config (label) under the directory config (searchPaths).

cf create-service p.config-server standard acme-config  -c  '{ "git": { "uri": "<this-repository-url>", "label": "config", "searchPaths": "config" } }'


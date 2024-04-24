# ssm-backend
bootstraping from aws parameter store as a external property source.

## API
http://localhost:8080/v1/customer/greeting/{name}

## Environment variables
`AWS_REGION=eu-west-1
AWS_SHARED_CREDENTIALS_FILE=C:/User/Uid/.aws/credentials`

_App will not work without AWS connection and parameter store created._
## Reference
https://docs.awspring.io/spring-cloud-aws/docs/3.1.0/reference/html/index.html#spring-cloud-aws-parameter-store

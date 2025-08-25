
### What it does
- `bounds.require(params)`: minimal parameter check used by the pipelines.

### How the pipelines load it
```groovy
library identifier: 'lab2-cicd@main', retriever: modernSCM([
  $class: 'GitSCMSource',
  remote: 'https://github.com/ahmedarnos/lab2-cicd.git'
])

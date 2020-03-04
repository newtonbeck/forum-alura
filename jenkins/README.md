# Executar o Jenkins via Docker
docker run \
  --name jenkins-server \
  -u root \
  --rm \
  -d \
  -p 8080:8080 \
  -p 50000:50000 \
  -v /var/run/docker.sock:/var/run/docker.sock \
  jenkinsci/blueocean

# Criar uma pipeline
- Multi-branch pipeline com discover branches
    https://crontab.guru/#*_*_*_*_*

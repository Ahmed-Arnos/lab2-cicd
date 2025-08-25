def require(Map p){ 
    if(!p.DOCKER_IMAGE?.trim()) error('set DOCKER_IMAGE') 
}
return this

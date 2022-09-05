package com.dimata.service.general.harisma.core.rest.client;

import com.dimata.service.general.harisma.core.security.jwt.tool.PublicKeyWrap;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("api/public/public-key")
@RegisterRestClient(configKey = "public-key-client")
public interface PublicKeyClient {
    
    @GET
    @Path("/latest")
    public List<PublicKeyWrap> getLatestPublicKey();

    @GET
    @Path("/{pkId}")
    public PublicKeyWrap getPublicKey(@PathParam String pkId);
}

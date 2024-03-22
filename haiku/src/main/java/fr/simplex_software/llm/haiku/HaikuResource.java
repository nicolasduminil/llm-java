package fr.simplex_software.llm.haiku;

import jakarta.ws.rs.*;
import org.jboss.resteasy.reactive.*;

@Path("/haiku")
public class HaikuResource
{
  private final HaikuService haikuService;

  public HaikuResource(HaikuService haikuService)
  {
    this.haikuService = haikuService;
  }

  @GET
  @Path("write")
  public String makeHaiku(@DefaultValue("samurai") @RestQuery String subject)
  {
    return haikuService.writeHaiku("myHaiku", subject);
  }

  @GET
  @Path("remind")
  public String lastHaiku()
  {
    return haikuService.lastHaiku("myHaiku");
  }
}

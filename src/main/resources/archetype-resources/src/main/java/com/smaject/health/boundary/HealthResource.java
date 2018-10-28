package ${groupId}.health.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Starting point of a application health check endpoint
 *
 * @author smaject.com
 */
@Path("ping")
public class HealthResource {

    @GET
    public String ping() {
        return "System is alive (" + System.currentTimeMillis() + ")!";
    }

}

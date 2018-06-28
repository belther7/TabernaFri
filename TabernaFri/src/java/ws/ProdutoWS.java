package ws;

import entidade.Produto;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import rn.ProdutoRN;

/**
 * REST Web Service
 *
 * @author anatoliandrei
 * @author lucasbeccon
 */
@Path("produto")
public class ProdutoWS {

    private ProdutoRN produtoRN;
    @Context
    private UriInfo context;

    public ProdutoWS() {
        produtoRN = new ProdutoRN();
    }

    @GET
    @Path("/listar")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produto> getListaProdutos() {
        return produtoRN.listar();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Produto getProdutoPorId(@PathParam("id") Long id) {
        Produto produto = produtoRN.buscarPorId(id);
        if (produto == null) {
            throw new NotFoundException();
        }
        return produto;
    }
}

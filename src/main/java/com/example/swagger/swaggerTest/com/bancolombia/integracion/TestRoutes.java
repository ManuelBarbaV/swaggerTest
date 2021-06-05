package com.bancolombia.integracion;

import javax.annotation.Generated;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;

/**
 * Generated from Swagger specification by Camel REST DSL generator.
 */
@Generated("org.apache.camel.generator.swagger.PathGenerator")
@Component
public final class TestRoutes extends RouteBuilder {
    /**
     * Defines Apache Camel routes using REST DSL fluent API.
     */
    public void configure() {

        restConfiguration().component("servlet").contextPath("/").clientRequestValidation(true);

        rest("/v1/operations/cross-product/operational-services/biller-file")
            .post("/biller/agreement/list-files")
                .description("Esta Api permite listar la información de los archivos que han sido cargados por el recaudador con determinados filtros que facilitan la busqueda.")
                .param()
                    .name("channel")
                    .type(RestParamType.header)
                    .dataType("string")
                    .required(true)
                    .description("Id de Canal valido para el convenio.")
                .endParam()
                .param()
                    .name("applicationId")
                    .type(RestParamType.header)
                    .dataType("string")
                    .required(true)
                    .description("Id de la aplicación del cliente.")
                .endParam()
                .param()
                    .name("systemId")
                    .type(RestParamType.header)
                    .dataType("string")
                    .required(false)
                    .description("Id del consumidor.")
                .endParam()
                .param()
                    .name("userName")
                    .type(RestParamType.header)
                    .dataType("string")
                    .required(true)
                    .description("Nombre del consumidor.")
                .endParam()
                .param()
                    .name("name")
                    .type(RestParamType.header)
                    .dataType("string")
                    .required(true)
                    .description("Nombre del servicio.")
                .endParam()
                .param()
                    .name("nameSpace")
                    .type(RestParamType.header)
                    .dataType("string")
                    .required(true)
                    .description("Nombre del espacio del servicio.")
                .endParam()
                .param()
                    .name("operation")
                    .type(RestParamType.header)
                    .dataType("string")
                    .required(true)
                    .description("Operación del servicio.")
                .endParam()
                .param()
                    .name("message-id")
                    .type(RestParamType.header)
                    .dataType("string")
                    .required(true)
                    .description("Identificador de transacción. Se recomienda usar un UUID para el valor de este campo.")
                .endParam()
                .param()
                    .name("request")
                    .type(RestParamType.body)
                    .required(true)
                .endParam()
                .to("direct:rest1")
            .head("/biller-file-information/health")
                .to("direct:rest2");
    }
}

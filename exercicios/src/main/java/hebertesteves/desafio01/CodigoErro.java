package hebertesteves.desafio01;

public enum CodigoErro {
    CONTINUE("Solicitação recebida, continuar", 100),
    SWITCHING_PROTOCOLS("Mudança de protocolo aceita", 101),
    PROCESSING("Processando (WebDAV)", 102),
    EARLY_HINTS("Dicas iniciais", 103),

    OK("Requisição bem-sucedida", 200),
    CREATED("Recurso criado", 201),
    ACCEPTED("Requisição aceita mas não concluída ainda", 202),
    NON_AUTHORITATIVE_INFORMATION("Informação não autoritativa", 203),
    NO_CONTENT("Sem conteúdo", 204),
    PARTIAL_CONTENT("Conteúdo parcial", 206),
    MULTI_STATUS("Multi-status (WebDAV)", 207),

    MULTIPLE_CHOICES("Múltiplas escolhas", 300),
    MOVED_PERMANENTLY("Movido permanentemente", 301),
    FOUND("Encontrado", 302),
    SEE_OTHER("Ver outro", 303),
    NOT_MODIFIED("Não modificado", 304),
    USE_PROXY("Usar proxy (obsoleto)", 305),
    TEMPORARY_REDIRECT("Redirecionamento temporário", 307),
    PERMANENT_REDIRECT("Redirecionamento permanente", 308),

    BAD_REQUEST("Requisição inválida", 400),
    UNAUTHORIZED("Não autorizado", 401),
    PAYMENT_REQUIRED("Pagamento necessário", 402),
    FORBIDDEN("Proibido", 403),
    NOT_FOUND("Não encontrado", 404),
    METHOD_NOT_ALLOWED("Método não permitido", 405),
    NOT_ACCEPTABLE("Não aceitável", 406),
    PROXY_AUTHENTICATION_REQUIRED("Autenticação de proxy requerida", 407),
    REQUEST_TIMEOUT("Tempo de requisição esgotado", 408),
    CONFLICT("Conflito", 409),
    GONE("Indisponível permanentemente", 410),
    LENGTH_REQUIRED("Tamanho requerido", 411),
    PRECONDITION_FAILED("Precondição falhou", 412),
    PAYLOAD_TOO_LARGE("Carga útil muito grande", 413),
    URI_TOO_LONG("URI muito longo", 414),
    UNSUPPORTED_MEDIA_TYPE("Tipo de mídia não suportado", 415),
    RANGE_NOT_SATISFIABLE("Faixa não satisfatória", 416),
    EXPECTATION_FAILED("Expectativa falhou", 417),
    IM_A_TEAPOT("Sou um bule de chá", 418),
    UNPROCESSABLE_ENTITY("Entidade não processável", 422),
    TOO_EARLY("Muito cedo", 425),
    UPGRADE_REQUIRED("Atualização requerida", 426),
    PRECONDITION_REQUIRED("Precondição requerida", 428),
    TOO_MANY_REQUESTS("Muitas requisições", 429),

    INTERNAL_SERVER_ERROR("Erro interno do servidor", 500),
    NOT_IMPLEMENTED("Não implementado", 501),
    BAD_GATEWAY("Gateway inválido", 502),
    SERVICE_UNAVAILABLE("Serviço indisponível", 503),
    GATEWAY_TIMEOUT("Tempo de gateway esgotado", 504),
    HTTP_VERSION_NOT_SUPPORTED("Versão HTTP não suportada", 505),
    VARIANT_ALSO_NEGOTIATES("Variação também negocia", 506),
    INSUFFICIENT_STORAGE("Armazenamento insuficiente", 507),
    LOOP_DETECTED("Loop detectado", 508),
    NOT_EXTENDED("Não estendido", 510),
    NETWORK_AUTHENTICATION_REQUIRED("Autenticação de rede necessária", 511);

    private final String descricao;
    private final int codigo;

    CodigoErro (String descricao, int codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }
}

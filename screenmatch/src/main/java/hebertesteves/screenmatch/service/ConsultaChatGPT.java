package hebertesteves.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}

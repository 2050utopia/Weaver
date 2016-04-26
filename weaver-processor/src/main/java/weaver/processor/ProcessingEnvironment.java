package weaver.processor;

import weaver.processor.injector.TemplateInjector;

/**
 * The {@code WeaverProcessor} can use facilities provided by this interface during processing.
 *
 * @author Saeed Masoumi (saeed@6thsolution.com)
 */
public interface ProcessingEnvironment {
    /**
     * @return Returns the logger.
     */
    Logger getLogger();

    /**
     * @return Returns the template injector.
     */
    TemplateInjector getTemplateInjector();
}

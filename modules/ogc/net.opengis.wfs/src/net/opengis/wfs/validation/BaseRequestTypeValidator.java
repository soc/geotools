/**
 *
 * $Id$
 */
package net.opengis.wfs.validation;

import java.util.Map;

/**
 * A sample validator interface for {@link net.opengis.wfs.BaseRequestType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BaseRequestTypeValidator {
  boolean validate();

  boolean validateHandle(String value);
  boolean validateService(String value);
  boolean validateVersion(String value);
  boolean validateBaseUrl(String value);
  boolean validateProvidedVersion(String value);
  boolean validateExtendedProperties(Map value);
}

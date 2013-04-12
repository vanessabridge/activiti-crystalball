package org.activiti.crystalball.diagram;

/*
 * #%L
 * image-builder
 * %%
 * Copyright (C) 2012 - 2013 crystalball
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import java.util.Map;

/**
 * Generate layer to process diagram 
 *
 */
public interface DiagramLayerGenerator {
	/**
	 * generate layer to process diagram (byte[])
	 * 
	 * @param imageType type of the image produced
	 * @param params parameters map  
	 * @return byte array which represents image  
	 */
	public byte[] generateLayer(String imageType, Map<String, Object> params);
}

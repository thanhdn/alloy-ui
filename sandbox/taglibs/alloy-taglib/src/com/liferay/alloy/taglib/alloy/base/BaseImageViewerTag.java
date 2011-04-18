/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.alloy.taglib.alloy.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public class BaseImageViewerTag extends com.liferay.taglib.util.IncludeTag {

	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public java.lang.Object getAlign() {
		return _align;
	}

	public boolean getAnim() {
		return _anim;
	}

	public java.lang.Object getArrowLeftEl() {
		return _arrowLeftEl;
	}

	public java.lang.Object getArrowRightEl() {
		return _arrowRightEl;
	}

	public java.lang.Object getImageviewerBodyContent() {
		return _imageviewerBodyContent;
	}

	public java.lang.String getBoundingBox() {
		return _boundingBox;
	}

	public java.lang.String getCaption() {
		return _caption;
	}

	public java.lang.Object getCaptionEl() {
		return _captionEl;
	}

	public boolean getCaptionFromTitle() {
		return _captionFromTitle;
	}

	public boolean getCentered() {
		return _centered;
	}

	public java.lang.Object getCloseEl() {
		return _closeEl;
	}

	public java.lang.Object getConstrain() {
		return _constrain;
	}

	public java.lang.String getContentBox() {
		return _contentBox;
	}

	public java.lang.String getCssClass() {
		return _cssClass;
	}

	public java.lang.Object getCurrentIndex() {
		return _currentIndex;
	}

	public boolean getDestroyed() {
		return _destroyed;
	}

	public boolean getDisabled() {
		return _disabled;
	}

	public java.lang.Object getFillHeight() {
		return _fillHeight;
	}

	public boolean getFocused() {
		return _focused;
	}

	public java.lang.Object getFooterContent() {
		return _footerContent;
	}

	public java.lang.Object getHeaderContent() {
		return _headerContent;
	}

	public java.lang.Object getHeight() {
		return _height;
	}

	public java.lang.String getHideClass() {
		return _hideClass;
	}

	public java.lang.String getImageviewerId() {
		return _imageviewerId;
	}

	public java.lang.Object getImage() {
		return _image;
	}

	public java.lang.Object getImageAnim() {
		return _imageAnim;
	}

	public java.lang.Object getInfoEl() {
		return _infoEl;
	}

	public java.lang.String getInfoTemplate() {
		return _infoTemplate;
	}

	public boolean getInitialized() {
		return _initialized;
	}

	public java.lang.Object getLinks() {
		return _links;
	}

	public java.lang.Object getLoader() {
		return _loader;
	}

	public boolean getLoading() {
		return _loading;
	}

	public java.lang.Object getLoadingEl() {
		return _loadingEl;
	}

	public java.lang.Object getMaxHeight() {
		return _maxHeight;
	}

	public java.lang.Object getMaxWidth() {
		return _maxWidth;
	}

	public java.lang.Object getModal() {
		return _modal;
	}

	public boolean getPreloadAllImages() {
		return _preloadAllImages;
	}

	public boolean getPreventOverlap() {
		return _preventOverlap;
	}

	public java.lang.Object getRender() {
		return _render;
	}

	public boolean getRendered() {
		return _rendered;
	}

	public boolean getShim() {
		return _shim;
	}

	public boolean getShowArrows() {
		return _showArrows;
	}

	public boolean getShowClose() {
		return _showClose;
	}

	public java.lang.String getSrcNode() {
		return _srcNode;
	}

	public java.lang.Object getStrings() {
		return _strings;
	}

	public java.lang.Object getTabIndex() {
		return _tabIndex;
	}

	public boolean getTotalLinks() {
		return _totalLinks;
	}

	public boolean getVisible() {
		return _visible;
	}

	public java.lang.Object getWidth() {
		return _width;
	}

	public java.lang.Object getX() {
		return _x;
	}

	public java.lang.Object getXy() {
		return _xy;
	}

	public java.lang.Object getY() {
		return _y;
	}

	public java.lang.Object getZIndex() {
		return _zIndex;
	}

	public java.lang.Object getAfterAlignChange() {
		return _afterAlignChange;
	}

	public java.lang.Object getAfterAnim() {
		return _afterAnim;
	}

	public java.lang.Object getAfterAnimChange() {
		return _afterAnimChange;
	}

	public java.lang.Object getAfterArrowLeftElChange() {
		return _afterArrowLeftElChange;
	}

	public java.lang.Object getAfterArrowRightElChange() {
		return _afterArrowRightElChange;
	}

	public java.lang.Object getAfterBodyContentChange() {
		return _afterBodyContentChange;
	}

	public java.lang.Object getAfterBoundingBoxChange() {
		return _afterBoundingBoxChange;
	}

	public java.lang.Object getAfterCaptionChange() {
		return _afterCaptionChange;
	}

	public java.lang.Object getAfterCaptionElChange() {
		return _afterCaptionElChange;
	}

	public java.lang.Object getAfterCaptionFromTitleChange() {
		return _afterCaptionFromTitleChange;
	}

	public java.lang.Object getAfterCenteredChange() {
		return _afterCenteredChange;
	}

	public java.lang.Object getAfterCloseElChange() {
		return _afterCloseElChange;
	}

	public java.lang.Object getAfterConstrainChange() {
		return _afterConstrainChange;
	}

	public java.lang.Object getAfterContentBoxChange() {
		return _afterContentBoxChange;
	}

	public java.lang.Object getAfterCssClassChange() {
		return _afterCssClassChange;
	}

	public java.lang.Object getAfterCurrentIndexChange() {
		return _afterCurrentIndexChange;
	}

	public java.lang.Object getAfterDestroy() {
		return _afterDestroy;
	}

	public java.lang.Object getAfterDestroyedChange() {
		return _afterDestroyedChange;
	}

	public java.lang.Object getAfterDisabledChange() {
		return _afterDisabledChange;
	}

	public java.lang.Object getAfterFillHeightChange() {
		return _afterFillHeightChange;
	}

	public java.lang.Object getAfterFocusedChange() {
		return _afterFocusedChange;
	}

	public java.lang.Object getAfterFooterContentChange() {
		return _afterFooterContentChange;
	}

	public java.lang.Object getAfterHeaderContentChange() {
		return _afterHeaderContentChange;
	}

	public java.lang.Object getAfterHeightChange() {
		return _afterHeightChange;
	}

	public java.lang.Object getAfterHideClassChange() {
		return _afterHideClassChange;
	}

	public java.lang.Object getAfterIdChange() {
		return _afterIdChange;
	}

	public java.lang.Object getAfterImageAnimChange() {
		return _afterImageAnimChange;
	}

	public java.lang.Object getAfterImageChange() {
		return _afterImageChange;
	}

	public java.lang.Object getAfterInfoElChange() {
		return _afterInfoElChange;
	}

	public java.lang.Object getAfterInfoTemplateChange() {
		return _afterInfoTemplateChange;
	}

	public java.lang.Object getAfterInit() {
		return _afterInit;
	}

	public java.lang.Object getAfterInitializedChange() {
		return _afterInitializedChange;
	}

	public java.lang.Object getAfterLinksChange() {
		return _afterLinksChange;
	}

	public java.lang.Object getAfterLoad() {
		return _afterLoad;
	}

	public java.lang.Object getAfterLoaderChange() {
		return _afterLoaderChange;
	}

	public java.lang.Object getAfterLoadingChange() {
		return _afterLoadingChange;
	}

	public java.lang.Object getAfterLoadingElChange() {
		return _afterLoadingElChange;
	}

	public java.lang.Object getAfterMaxHeightChange() {
		return _afterMaxHeightChange;
	}

	public java.lang.Object getAfterMaxWidthChange() {
		return _afterMaxWidthChange;
	}

	public java.lang.Object getAfterModalChange() {
		return _afterModalChange;
	}

	public java.lang.Object getAfterPreloadAllImagesChange() {
		return _afterPreloadAllImagesChange;
	}

	public java.lang.Object getAfterPreventOverlapChange() {
		return _afterPreventOverlapChange;
	}

	public java.lang.Object getAfterRenderChange() {
		return _afterRenderChange;
	}

	public java.lang.Object getAfterRenderedChange() {
		return _afterRenderedChange;
	}

	public java.lang.Object getAfterRequest() {
		return _afterRequest;
	}

	public java.lang.Object getAfterShimChange() {
		return _afterShimChange;
	}

	public java.lang.Object getAfterShowArrowsChange() {
		return _afterShowArrowsChange;
	}

	public java.lang.Object getAfterShowCloseChange() {
		return _afterShowCloseChange;
	}

	public java.lang.Object getAfterSrcNodeChange() {
		return _afterSrcNodeChange;
	}

	public java.lang.Object getAfterStringsChange() {
		return _afterStringsChange;
	}

	public java.lang.Object getAfterTabIndexChange() {
		return _afterTabIndexChange;
	}

	public java.lang.Object getAfterTotalLinksChange() {
		return _afterTotalLinksChange;
	}

	public java.lang.Object getAfterVisibleChange() {
		return _afterVisibleChange;
	}

	public java.lang.Object getAfterContentUpdate() {
		return _afterContentUpdate;
	}

	public java.lang.Object getAfterRender() {
		return _afterRender;
	}

	public java.lang.Object getAfterWidthChange() {
		return _afterWidthChange;
	}

	public java.lang.Object getAfterXChange() {
		return _afterXChange;
	}

	public java.lang.Object getAfterXyChange() {
		return _afterXyChange;
	}

	public java.lang.Object getAfterYChange() {
		return _afterYChange;
	}

	public java.lang.Object getAfterZIndexChange() {
		return _afterZIndexChange;
	}

	public java.lang.Object getOnAlignChange() {
		return _onAlignChange;
	}

	public java.lang.Object getOnAnim() {
		return _onAnim;
	}

	public java.lang.Object getOnAnimChange() {
		return _onAnimChange;
	}

	public java.lang.Object getOnArrowLeftElChange() {
		return _onArrowLeftElChange;
	}

	public java.lang.Object getOnArrowRightElChange() {
		return _onArrowRightElChange;
	}

	public java.lang.Object getOnBodyContentChange() {
		return _onBodyContentChange;
	}

	public java.lang.Object getOnBoundingBoxChange() {
		return _onBoundingBoxChange;
	}

	public java.lang.Object getOnCaptionChange() {
		return _onCaptionChange;
	}

	public java.lang.Object getOnCaptionElChange() {
		return _onCaptionElChange;
	}

	public java.lang.Object getOnCaptionFromTitleChange() {
		return _onCaptionFromTitleChange;
	}

	public java.lang.Object getOnCenteredChange() {
		return _onCenteredChange;
	}

	public java.lang.Object getOnCloseElChange() {
		return _onCloseElChange;
	}

	public java.lang.Object getOnConstrainChange() {
		return _onConstrainChange;
	}

	public java.lang.Object getOnContentBoxChange() {
		return _onContentBoxChange;
	}

	public java.lang.Object getOnCssClassChange() {
		return _onCssClassChange;
	}

	public java.lang.Object getOnCurrentIndexChange() {
		return _onCurrentIndexChange;
	}

	public java.lang.Object getOnDestroy() {
		return _onDestroy;
	}

	public java.lang.Object getOnDestroyedChange() {
		return _onDestroyedChange;
	}

	public java.lang.Object getOnDisabledChange() {
		return _onDisabledChange;
	}

	public java.lang.Object getOnFillHeightChange() {
		return _onFillHeightChange;
	}

	public java.lang.Object getOnFocusedChange() {
		return _onFocusedChange;
	}

	public java.lang.Object getOnFooterContentChange() {
		return _onFooterContentChange;
	}

	public java.lang.Object getOnHeaderContentChange() {
		return _onHeaderContentChange;
	}

	public java.lang.Object getOnHeightChange() {
		return _onHeightChange;
	}

	public java.lang.Object getOnHideClassChange() {
		return _onHideClassChange;
	}

	public java.lang.Object getOnIdChange() {
		return _onIdChange;
	}

	public java.lang.Object getOnImageAnimChange() {
		return _onImageAnimChange;
	}

	public java.lang.Object getOnImageChange() {
		return _onImageChange;
	}

	public java.lang.Object getOnInfoElChange() {
		return _onInfoElChange;
	}

	public java.lang.Object getOnInfoTemplateChange() {
		return _onInfoTemplateChange;
	}

	public java.lang.Object getOnInit() {
		return _onInit;
	}

	public java.lang.Object getOnInitializedChange() {
		return _onInitializedChange;
	}

	public java.lang.Object getOnLinksChange() {
		return _onLinksChange;
	}

	public java.lang.Object getOnLoad() {
		return _onLoad;
	}

	public java.lang.Object getOnLoaderChange() {
		return _onLoaderChange;
	}

	public java.lang.Object getOnLoadingChange() {
		return _onLoadingChange;
	}

	public java.lang.Object getOnLoadingElChange() {
		return _onLoadingElChange;
	}

	public java.lang.Object getOnMaxHeightChange() {
		return _onMaxHeightChange;
	}

	public java.lang.Object getOnMaxWidthChange() {
		return _onMaxWidthChange;
	}

	public java.lang.Object getOnModalChange() {
		return _onModalChange;
	}

	public java.lang.Object getOnPreloadAllImagesChange() {
		return _onPreloadAllImagesChange;
	}

	public java.lang.Object getOnPreventOverlapChange() {
		return _onPreventOverlapChange;
	}

	public java.lang.Object getOnRenderChange() {
		return _onRenderChange;
	}

	public java.lang.Object getOnRenderedChange() {
		return _onRenderedChange;
	}

	public java.lang.Object getOnRequest() {
		return _onRequest;
	}

	public java.lang.Object getOnShimChange() {
		return _onShimChange;
	}

	public java.lang.Object getOnShowArrowsChange() {
		return _onShowArrowsChange;
	}

	public java.lang.Object getOnShowCloseChange() {
		return _onShowCloseChange;
	}

	public java.lang.Object getOnSrcNodeChange() {
		return _onSrcNodeChange;
	}

	public java.lang.Object getOnStringsChange() {
		return _onStringsChange;
	}

	public java.lang.Object getOnTabIndexChange() {
		return _onTabIndexChange;
	}

	public java.lang.Object getOnTotalLinksChange() {
		return _onTotalLinksChange;
	}

	public java.lang.Object getOnVisibleChange() {
		return _onVisibleChange;
	}

	public java.lang.Object getOnContentUpdate() {
		return _onContentUpdate;
	}

	public java.lang.Object getOnRender() {
		return _onRender;
	}

	public java.lang.Object getOnWidthChange() {
		return _onWidthChange;
	}

	public java.lang.Object getOnXChange() {
		return _onXChange;
	}

	public java.lang.Object getOnXyChange() {
		return _onXyChange;
	}

	public java.lang.Object getOnYChange() {
		return _onYChange;
	}

	public java.lang.Object getOnZIndexChange() {
		return _onZIndexChange;
	}

	public void setAlign(java.lang.Object align) {
		_align = align;

		setScopedAttribute("align", align);
	}

	public void setAnim(boolean anim) {
		_anim = anim;

		setScopedAttribute("anim", anim);
	}

	public void setArrowLeftEl(java.lang.Object arrowLeftEl) {
		_arrowLeftEl = arrowLeftEl;

		setScopedAttribute("arrowLeftEl", arrowLeftEl);
	}

	public void setArrowRightEl(java.lang.Object arrowRightEl) {
		_arrowRightEl = arrowRightEl;

		setScopedAttribute("arrowRightEl", arrowRightEl);
	}

	public void setImageviewerBodyContent(java.lang.Object imageviewerBodyContent) {
		_imageviewerBodyContent = imageviewerBodyContent;

		setScopedAttribute("imageviewerBodyContent", imageviewerBodyContent);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		_boundingBox = boundingBox;

		setScopedAttribute("boundingBox", boundingBox);
	}

	public void setCaption(java.lang.String caption) {
		_caption = caption;

		setScopedAttribute("caption", caption);
	}

	public void setCaptionEl(java.lang.Object captionEl) {
		_captionEl = captionEl;

		setScopedAttribute("captionEl", captionEl);
	}

	public void setCaptionFromTitle(boolean captionFromTitle) {
		_captionFromTitle = captionFromTitle;

		setScopedAttribute("captionFromTitle", captionFromTitle);
	}

	public void setCentered(boolean centered) {
		_centered = centered;

		setScopedAttribute("centered", centered);
	}

	public void setCloseEl(java.lang.Object closeEl) {
		_closeEl = closeEl;

		setScopedAttribute("closeEl", closeEl);
	}

	public void setConstrain(java.lang.Object constrain) {
		_constrain = constrain;

		setScopedAttribute("constrain", constrain);
	}

	public void setContentBox(java.lang.String contentBox) {
		_contentBox = contentBox;

		setScopedAttribute("contentBox", contentBox);
	}

	public void setCssClass(java.lang.String cssClass) {
		_cssClass = cssClass;

		setScopedAttribute("cssClass", cssClass);
	}

	public void setCurrentIndex(java.lang.Object currentIndex) {
		_currentIndex = currentIndex;

		setScopedAttribute("currentIndex", currentIndex);
	}

	public void setDestroyed(boolean destroyed) {
		_destroyed = destroyed;

		setScopedAttribute("destroyed", destroyed);
	}

	public void setDisabled(boolean disabled) {
		_disabled = disabled;

		setScopedAttribute("disabled", disabled);
	}

	public void setFillHeight(java.lang.Object fillHeight) {
		_fillHeight = fillHeight;

		setScopedAttribute("fillHeight", fillHeight);
	}

	public void setFocused(boolean focused) {
		_focused = focused;

		setScopedAttribute("focused", focused);
	}

	public void setFooterContent(java.lang.Object footerContent) {
		_footerContent = footerContent;

		setScopedAttribute("footerContent", footerContent);
	}

	public void setHeaderContent(java.lang.Object headerContent) {
		_headerContent = headerContent;

		setScopedAttribute("headerContent", headerContent);
	}

	public void setHeight(java.lang.Object height) {
		_height = height;

		setScopedAttribute("height", height);
	}

	public void setHideClass(java.lang.String hideClass) {
		_hideClass = hideClass;

		setScopedAttribute("hideClass", hideClass);
	}

	public void setImageviewerId(java.lang.String imageviewerId) {
		_imageviewerId = imageviewerId;

		setScopedAttribute("imageviewerId", imageviewerId);
	}

	public void setImage(java.lang.Object image) {
		_image = image;

		setScopedAttribute("image", image);
	}

	public void setImageAnim(java.lang.Object imageAnim) {
		_imageAnim = imageAnim;

		setScopedAttribute("imageAnim", imageAnim);
	}

	public void setInfoEl(java.lang.Object infoEl) {
		_infoEl = infoEl;

		setScopedAttribute("infoEl", infoEl);
	}

	public void setInfoTemplate(java.lang.String infoTemplate) {
		_infoTemplate = infoTemplate;

		setScopedAttribute("infoTemplate", infoTemplate);
	}

	public void setInitialized(boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setLinks(java.lang.Object links) {
		_links = links;

		setScopedAttribute("links", links);
	}

	public void setLoader(java.lang.Object loader) {
		_loader = loader;

		setScopedAttribute("loader", loader);
	}

	public void setLoading(boolean loading) {
		_loading = loading;

		setScopedAttribute("loading", loading);
	}

	public void setLoadingEl(java.lang.Object loadingEl) {
		_loadingEl = loadingEl;

		setScopedAttribute("loadingEl", loadingEl);
	}

	public void setMaxHeight(java.lang.Object maxHeight) {
		_maxHeight = maxHeight;

		setScopedAttribute("maxHeight", maxHeight);
	}

	public void setMaxWidth(java.lang.Object maxWidth) {
		_maxWidth = maxWidth;

		setScopedAttribute("maxWidth", maxWidth);
	}

	public void setModal(java.lang.Object modal) {
		_modal = modal;

		setScopedAttribute("modal", modal);
	}

	public void setPreloadAllImages(boolean preloadAllImages) {
		_preloadAllImages = preloadAllImages;

		setScopedAttribute("preloadAllImages", preloadAllImages);
	}

	public void setPreventOverlap(boolean preventOverlap) {
		_preventOverlap = preventOverlap;

		setScopedAttribute("preventOverlap", preventOverlap);
	}

	public void setRender(java.lang.Object render) {
		_render = render;

		setScopedAttribute("render", render);
	}

	public void setRendered(boolean rendered) {
		_rendered = rendered;

		setScopedAttribute("rendered", rendered);
	}

	public void setShim(boolean shim) {
		_shim = shim;

		setScopedAttribute("shim", shim);
	}

	public void setShowArrows(boolean showArrows) {
		_showArrows = showArrows;

		setScopedAttribute("showArrows", showArrows);
	}

	public void setShowClose(boolean showClose) {
		_showClose = showClose;

		setScopedAttribute("showClose", showClose);
	}

	public void setSrcNode(java.lang.String srcNode) {
		_srcNode = srcNode;

		setScopedAttribute("srcNode", srcNode);
	}

	public void setStrings(java.lang.Object strings) {
		_strings = strings;

		setScopedAttribute("strings", strings);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		_tabIndex = tabIndex;

		setScopedAttribute("tabIndex", tabIndex);
	}

	public void setTotalLinks(boolean totalLinks) {
		_totalLinks = totalLinks;

		setScopedAttribute("totalLinks", totalLinks);
	}

	public void setVisible(boolean visible) {
		_visible = visible;

		setScopedAttribute("visible", visible);
	}

	public void setWidth(java.lang.Object width) {
		_width = width;

		setScopedAttribute("width", width);
	}

	public void setX(java.lang.Object x) {
		_x = x;

		setScopedAttribute("x", x);
	}

	public void setXy(java.lang.Object xy) {
		_xy = xy;

		setScopedAttribute("xy", xy);
	}

	public void setY(java.lang.Object y) {
		_y = y;

		setScopedAttribute("y", y);
	}

	public void setZIndex(java.lang.Object zIndex) {
		_zIndex = zIndex;

		setScopedAttribute("zIndex", zIndex);
	}

	public void setAfterAlignChange(java.lang.Object afterAlignChange) {
		_afterAlignChange = afterAlignChange;

		setScopedAttribute("afterAlignChange", afterAlignChange);
	}

	public void setAfterAnim(java.lang.Object afterAnim) {
		_afterAnim = afterAnim;

		setScopedAttribute("afterAnim", afterAnim);
	}

	public void setAfterAnimChange(java.lang.Object afterAnimChange) {
		_afterAnimChange = afterAnimChange;

		setScopedAttribute("afterAnimChange", afterAnimChange);
	}

	public void setAfterArrowLeftElChange(java.lang.Object afterArrowLeftElChange) {
		_afterArrowLeftElChange = afterArrowLeftElChange;

		setScopedAttribute("afterArrowLeftElChange", afterArrowLeftElChange);
	}

	public void setAfterArrowRightElChange(java.lang.Object afterArrowRightElChange) {
		_afterArrowRightElChange = afterArrowRightElChange;

		setScopedAttribute("afterArrowRightElChange", afterArrowRightElChange);
	}

	public void setAfterBodyContentChange(java.lang.Object afterBodyContentChange) {
		_afterBodyContentChange = afterBodyContentChange;

		setScopedAttribute("afterBodyContentChange", afterBodyContentChange);
	}

	public void setAfterBoundingBoxChange(java.lang.Object afterBoundingBoxChange) {
		_afterBoundingBoxChange = afterBoundingBoxChange;

		setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
	}

	public void setAfterCaptionChange(java.lang.Object afterCaptionChange) {
		_afterCaptionChange = afterCaptionChange;

		setScopedAttribute("afterCaptionChange", afterCaptionChange);
	}

	public void setAfterCaptionElChange(java.lang.Object afterCaptionElChange) {
		_afterCaptionElChange = afterCaptionElChange;

		setScopedAttribute("afterCaptionElChange", afterCaptionElChange);
	}

	public void setAfterCaptionFromTitleChange(java.lang.Object afterCaptionFromTitleChange) {
		_afterCaptionFromTitleChange = afterCaptionFromTitleChange;

		setScopedAttribute("afterCaptionFromTitleChange", afterCaptionFromTitleChange);
	}

	public void setAfterCenteredChange(java.lang.Object afterCenteredChange) {
		_afterCenteredChange = afterCenteredChange;

		setScopedAttribute("afterCenteredChange", afterCenteredChange);
	}

	public void setAfterCloseElChange(java.lang.Object afterCloseElChange) {
		_afterCloseElChange = afterCloseElChange;

		setScopedAttribute("afterCloseElChange", afterCloseElChange);
	}

	public void setAfterConstrainChange(java.lang.Object afterConstrainChange) {
		_afterConstrainChange = afterConstrainChange;

		setScopedAttribute("afterConstrainChange", afterConstrainChange);
	}

	public void setAfterContentBoxChange(java.lang.Object afterContentBoxChange) {
		_afterContentBoxChange = afterContentBoxChange;

		setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
	}

	public void setAfterCssClassChange(java.lang.Object afterCssClassChange) {
		_afterCssClassChange = afterCssClassChange;

		setScopedAttribute("afterCssClassChange", afterCssClassChange);
	}

	public void setAfterCurrentIndexChange(java.lang.Object afterCurrentIndexChange) {
		_afterCurrentIndexChange = afterCurrentIndexChange;

		setScopedAttribute("afterCurrentIndexChange", afterCurrentIndexChange);
	}

	public void setAfterDestroy(java.lang.Object afterDestroy) {
		_afterDestroy = afterDestroy;

		setScopedAttribute("afterDestroy", afterDestroy);
	}

	public void setAfterDestroyedChange(java.lang.Object afterDestroyedChange) {
		_afterDestroyedChange = afterDestroyedChange;

		setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
	}

	public void setAfterDisabledChange(java.lang.Object afterDisabledChange) {
		_afterDisabledChange = afterDisabledChange;

		setScopedAttribute("afterDisabledChange", afterDisabledChange);
	}

	public void setAfterFillHeightChange(java.lang.Object afterFillHeightChange) {
		_afterFillHeightChange = afterFillHeightChange;

		setScopedAttribute("afterFillHeightChange", afterFillHeightChange);
	}

	public void setAfterFocusedChange(java.lang.Object afterFocusedChange) {
		_afterFocusedChange = afterFocusedChange;

		setScopedAttribute("afterFocusedChange", afterFocusedChange);
	}

	public void setAfterFooterContentChange(java.lang.Object afterFooterContentChange) {
		_afterFooterContentChange = afterFooterContentChange;

		setScopedAttribute("afterFooterContentChange", afterFooterContentChange);
	}

	public void setAfterHeaderContentChange(java.lang.Object afterHeaderContentChange) {
		_afterHeaderContentChange = afterHeaderContentChange;

		setScopedAttribute("afterHeaderContentChange", afterHeaderContentChange);
	}

	public void setAfterHeightChange(java.lang.Object afterHeightChange) {
		_afterHeightChange = afterHeightChange;

		setScopedAttribute("afterHeightChange", afterHeightChange);
	}

	public void setAfterHideClassChange(java.lang.Object afterHideClassChange) {
		_afterHideClassChange = afterHideClassChange;

		setScopedAttribute("afterHideClassChange", afterHideClassChange);
	}

	public void setAfterIdChange(java.lang.Object afterIdChange) {
		_afterIdChange = afterIdChange;

		setScopedAttribute("afterIdChange", afterIdChange);
	}

	public void setAfterImageAnimChange(java.lang.Object afterImageAnimChange) {
		_afterImageAnimChange = afterImageAnimChange;

		setScopedAttribute("afterImageAnimChange", afterImageAnimChange);
	}

	public void setAfterImageChange(java.lang.Object afterImageChange) {
		_afterImageChange = afterImageChange;

		setScopedAttribute("afterImageChange", afterImageChange);
	}

	public void setAfterInfoElChange(java.lang.Object afterInfoElChange) {
		_afterInfoElChange = afterInfoElChange;

		setScopedAttribute("afterInfoElChange", afterInfoElChange);
	}

	public void setAfterInfoTemplateChange(java.lang.Object afterInfoTemplateChange) {
		_afterInfoTemplateChange = afterInfoTemplateChange;

		setScopedAttribute("afterInfoTemplateChange", afterInfoTemplateChange);
	}

	public void setAfterInit(java.lang.Object afterInit) {
		_afterInit = afterInit;

		setScopedAttribute("afterInit", afterInit);
	}

	public void setAfterInitializedChange(java.lang.Object afterInitializedChange) {
		_afterInitializedChange = afterInitializedChange;

		setScopedAttribute("afterInitializedChange", afterInitializedChange);
	}

	public void setAfterLinksChange(java.lang.Object afterLinksChange) {
		_afterLinksChange = afterLinksChange;

		setScopedAttribute("afterLinksChange", afterLinksChange);
	}

	public void setAfterLoad(java.lang.Object afterLoad) {
		_afterLoad = afterLoad;

		setScopedAttribute("afterLoad", afterLoad);
	}

	public void setAfterLoaderChange(java.lang.Object afterLoaderChange) {
		_afterLoaderChange = afterLoaderChange;

		setScopedAttribute("afterLoaderChange", afterLoaderChange);
	}

	public void setAfterLoadingChange(java.lang.Object afterLoadingChange) {
		_afterLoadingChange = afterLoadingChange;

		setScopedAttribute("afterLoadingChange", afterLoadingChange);
	}

	public void setAfterLoadingElChange(java.lang.Object afterLoadingElChange) {
		_afterLoadingElChange = afterLoadingElChange;

		setScopedAttribute("afterLoadingElChange", afterLoadingElChange);
	}

	public void setAfterMaxHeightChange(java.lang.Object afterMaxHeightChange) {
		_afterMaxHeightChange = afterMaxHeightChange;

		setScopedAttribute("afterMaxHeightChange", afterMaxHeightChange);
	}

	public void setAfterMaxWidthChange(java.lang.Object afterMaxWidthChange) {
		_afterMaxWidthChange = afterMaxWidthChange;

		setScopedAttribute("afterMaxWidthChange", afterMaxWidthChange);
	}

	public void setAfterModalChange(java.lang.Object afterModalChange) {
		_afterModalChange = afterModalChange;

		setScopedAttribute("afterModalChange", afterModalChange);
	}

	public void setAfterPreloadAllImagesChange(java.lang.Object afterPreloadAllImagesChange) {
		_afterPreloadAllImagesChange = afterPreloadAllImagesChange;

		setScopedAttribute("afterPreloadAllImagesChange", afterPreloadAllImagesChange);
	}

	public void setAfterPreventOverlapChange(java.lang.Object afterPreventOverlapChange) {
		_afterPreventOverlapChange = afterPreventOverlapChange;

		setScopedAttribute("afterPreventOverlapChange", afterPreventOverlapChange);
	}

	public void setAfterRenderChange(java.lang.Object afterRenderChange) {
		_afterRenderChange = afterRenderChange;

		setScopedAttribute("afterRenderChange", afterRenderChange);
	}

	public void setAfterRenderedChange(java.lang.Object afterRenderedChange) {
		_afterRenderedChange = afterRenderedChange;

		setScopedAttribute("afterRenderedChange", afterRenderedChange);
	}

	public void setAfterRequest(java.lang.Object afterRequest) {
		_afterRequest = afterRequest;

		setScopedAttribute("afterRequest", afterRequest);
	}

	public void setAfterShimChange(java.lang.Object afterShimChange) {
		_afterShimChange = afterShimChange;

		setScopedAttribute("afterShimChange", afterShimChange);
	}

	public void setAfterShowArrowsChange(java.lang.Object afterShowArrowsChange) {
		_afterShowArrowsChange = afterShowArrowsChange;

		setScopedAttribute("afterShowArrowsChange", afterShowArrowsChange);
	}

	public void setAfterShowCloseChange(java.lang.Object afterShowCloseChange) {
		_afterShowCloseChange = afterShowCloseChange;

		setScopedAttribute("afterShowCloseChange", afterShowCloseChange);
	}

	public void setAfterSrcNodeChange(java.lang.Object afterSrcNodeChange) {
		_afterSrcNodeChange = afterSrcNodeChange;

		setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
	}

	public void setAfterStringsChange(java.lang.Object afterStringsChange) {
		_afterStringsChange = afterStringsChange;

		setScopedAttribute("afterStringsChange", afterStringsChange);
	}

	public void setAfterTabIndexChange(java.lang.Object afterTabIndexChange) {
		_afterTabIndexChange = afterTabIndexChange;

		setScopedAttribute("afterTabIndexChange", afterTabIndexChange);
	}

	public void setAfterTotalLinksChange(java.lang.Object afterTotalLinksChange) {
		_afterTotalLinksChange = afterTotalLinksChange;

		setScopedAttribute("afterTotalLinksChange", afterTotalLinksChange);
	}

	public void setAfterVisibleChange(java.lang.Object afterVisibleChange) {
		_afterVisibleChange = afterVisibleChange;

		setScopedAttribute("afterVisibleChange", afterVisibleChange);
	}

	public void setAfterContentUpdate(java.lang.Object afterContentUpdate) {
		_afterContentUpdate = afterContentUpdate;

		setScopedAttribute("afterContentUpdate", afterContentUpdate);
	}

	public void setAfterRender(java.lang.Object afterRender) {
		_afterRender = afterRender;

		setScopedAttribute("afterRender", afterRender);
	}

	public void setAfterWidthChange(java.lang.Object afterWidthChange) {
		_afterWidthChange = afterWidthChange;

		setScopedAttribute("afterWidthChange", afterWidthChange);
	}

	public void setAfterXChange(java.lang.Object afterXChange) {
		_afterXChange = afterXChange;

		setScopedAttribute("afterXChange", afterXChange);
	}

	public void setAfterXyChange(java.lang.Object afterXyChange) {
		_afterXyChange = afterXyChange;

		setScopedAttribute("afterXyChange", afterXyChange);
	}

	public void setAfterYChange(java.lang.Object afterYChange) {
		_afterYChange = afterYChange;

		setScopedAttribute("afterYChange", afterYChange);
	}

	public void setAfterZIndexChange(java.lang.Object afterZIndexChange) {
		_afterZIndexChange = afterZIndexChange;

		setScopedAttribute("afterZIndexChange", afterZIndexChange);
	}

	public void setOnAlignChange(java.lang.Object onAlignChange) {
		_onAlignChange = onAlignChange;

		setScopedAttribute("onAlignChange", onAlignChange);
	}

	public void setOnAnim(java.lang.Object onAnim) {
		_onAnim = onAnim;

		setScopedAttribute("onAnim", onAnim);
	}

	public void setOnAnimChange(java.lang.Object onAnimChange) {
		_onAnimChange = onAnimChange;

		setScopedAttribute("onAnimChange", onAnimChange);
	}

	public void setOnArrowLeftElChange(java.lang.Object onArrowLeftElChange) {
		_onArrowLeftElChange = onArrowLeftElChange;

		setScopedAttribute("onArrowLeftElChange", onArrowLeftElChange);
	}

	public void setOnArrowRightElChange(java.lang.Object onArrowRightElChange) {
		_onArrowRightElChange = onArrowRightElChange;

		setScopedAttribute("onArrowRightElChange", onArrowRightElChange);
	}

	public void setOnBodyContentChange(java.lang.Object onBodyContentChange) {
		_onBodyContentChange = onBodyContentChange;

		setScopedAttribute("onBodyContentChange", onBodyContentChange);
	}

	public void setOnBoundingBoxChange(java.lang.Object onBoundingBoxChange) {
		_onBoundingBoxChange = onBoundingBoxChange;

		setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
	}

	public void setOnCaptionChange(java.lang.Object onCaptionChange) {
		_onCaptionChange = onCaptionChange;

		setScopedAttribute("onCaptionChange", onCaptionChange);
	}

	public void setOnCaptionElChange(java.lang.Object onCaptionElChange) {
		_onCaptionElChange = onCaptionElChange;

		setScopedAttribute("onCaptionElChange", onCaptionElChange);
	}

	public void setOnCaptionFromTitleChange(java.lang.Object onCaptionFromTitleChange) {
		_onCaptionFromTitleChange = onCaptionFromTitleChange;

		setScopedAttribute("onCaptionFromTitleChange", onCaptionFromTitleChange);
	}

	public void setOnCenteredChange(java.lang.Object onCenteredChange) {
		_onCenteredChange = onCenteredChange;

		setScopedAttribute("onCenteredChange", onCenteredChange);
	}

	public void setOnCloseElChange(java.lang.Object onCloseElChange) {
		_onCloseElChange = onCloseElChange;

		setScopedAttribute("onCloseElChange", onCloseElChange);
	}

	public void setOnConstrainChange(java.lang.Object onConstrainChange) {
		_onConstrainChange = onConstrainChange;

		setScopedAttribute("onConstrainChange", onConstrainChange);
	}

	public void setOnContentBoxChange(java.lang.Object onContentBoxChange) {
		_onContentBoxChange = onContentBoxChange;

		setScopedAttribute("onContentBoxChange", onContentBoxChange);
	}

	public void setOnCssClassChange(java.lang.Object onCssClassChange) {
		_onCssClassChange = onCssClassChange;

		setScopedAttribute("onCssClassChange", onCssClassChange);
	}

	public void setOnCurrentIndexChange(java.lang.Object onCurrentIndexChange) {
		_onCurrentIndexChange = onCurrentIndexChange;

		setScopedAttribute("onCurrentIndexChange", onCurrentIndexChange);
	}

	public void setOnDestroy(java.lang.Object onDestroy) {
		_onDestroy = onDestroy;

		setScopedAttribute("onDestroy", onDestroy);
	}

	public void setOnDestroyedChange(java.lang.Object onDestroyedChange) {
		_onDestroyedChange = onDestroyedChange;

		setScopedAttribute("onDestroyedChange", onDestroyedChange);
	}

	public void setOnDisabledChange(java.lang.Object onDisabledChange) {
		_onDisabledChange = onDisabledChange;

		setScopedAttribute("onDisabledChange", onDisabledChange);
	}

	public void setOnFillHeightChange(java.lang.Object onFillHeightChange) {
		_onFillHeightChange = onFillHeightChange;

		setScopedAttribute("onFillHeightChange", onFillHeightChange);
	}

	public void setOnFocusedChange(java.lang.Object onFocusedChange) {
		_onFocusedChange = onFocusedChange;

		setScopedAttribute("onFocusedChange", onFocusedChange);
	}

	public void setOnFooterContentChange(java.lang.Object onFooterContentChange) {
		_onFooterContentChange = onFooterContentChange;

		setScopedAttribute("onFooterContentChange", onFooterContentChange);
	}

	public void setOnHeaderContentChange(java.lang.Object onHeaderContentChange) {
		_onHeaderContentChange = onHeaderContentChange;

		setScopedAttribute("onHeaderContentChange", onHeaderContentChange);
	}

	public void setOnHeightChange(java.lang.Object onHeightChange) {
		_onHeightChange = onHeightChange;

		setScopedAttribute("onHeightChange", onHeightChange);
	}

	public void setOnHideClassChange(java.lang.Object onHideClassChange) {
		_onHideClassChange = onHideClassChange;

		setScopedAttribute("onHideClassChange", onHideClassChange);
	}

	public void setOnIdChange(java.lang.Object onIdChange) {
		_onIdChange = onIdChange;

		setScopedAttribute("onIdChange", onIdChange);
	}

	public void setOnImageAnimChange(java.lang.Object onImageAnimChange) {
		_onImageAnimChange = onImageAnimChange;

		setScopedAttribute("onImageAnimChange", onImageAnimChange);
	}

	public void setOnImageChange(java.lang.Object onImageChange) {
		_onImageChange = onImageChange;

		setScopedAttribute("onImageChange", onImageChange);
	}

	public void setOnInfoElChange(java.lang.Object onInfoElChange) {
		_onInfoElChange = onInfoElChange;

		setScopedAttribute("onInfoElChange", onInfoElChange);
	}

	public void setOnInfoTemplateChange(java.lang.Object onInfoTemplateChange) {
		_onInfoTemplateChange = onInfoTemplateChange;

		setScopedAttribute("onInfoTemplateChange", onInfoTemplateChange);
	}

	public void setOnInit(java.lang.Object onInit) {
		_onInit = onInit;

		setScopedAttribute("onInit", onInit);
	}

	public void setOnInitializedChange(java.lang.Object onInitializedChange) {
		_onInitializedChange = onInitializedChange;

		setScopedAttribute("onInitializedChange", onInitializedChange);
	}

	public void setOnLinksChange(java.lang.Object onLinksChange) {
		_onLinksChange = onLinksChange;

		setScopedAttribute("onLinksChange", onLinksChange);
	}

	public void setOnLoad(java.lang.Object onLoad) {
		_onLoad = onLoad;

		setScopedAttribute("onLoad", onLoad);
	}

	public void setOnLoaderChange(java.lang.Object onLoaderChange) {
		_onLoaderChange = onLoaderChange;

		setScopedAttribute("onLoaderChange", onLoaderChange);
	}

	public void setOnLoadingChange(java.lang.Object onLoadingChange) {
		_onLoadingChange = onLoadingChange;

		setScopedAttribute("onLoadingChange", onLoadingChange);
	}

	public void setOnLoadingElChange(java.lang.Object onLoadingElChange) {
		_onLoadingElChange = onLoadingElChange;

		setScopedAttribute("onLoadingElChange", onLoadingElChange);
	}

	public void setOnMaxHeightChange(java.lang.Object onMaxHeightChange) {
		_onMaxHeightChange = onMaxHeightChange;

		setScopedAttribute("onMaxHeightChange", onMaxHeightChange);
	}

	public void setOnMaxWidthChange(java.lang.Object onMaxWidthChange) {
		_onMaxWidthChange = onMaxWidthChange;

		setScopedAttribute("onMaxWidthChange", onMaxWidthChange);
	}

	public void setOnModalChange(java.lang.Object onModalChange) {
		_onModalChange = onModalChange;

		setScopedAttribute("onModalChange", onModalChange);
	}

	public void setOnPreloadAllImagesChange(java.lang.Object onPreloadAllImagesChange) {
		_onPreloadAllImagesChange = onPreloadAllImagesChange;

		setScopedAttribute("onPreloadAllImagesChange", onPreloadAllImagesChange);
	}

	public void setOnPreventOverlapChange(java.lang.Object onPreventOverlapChange) {
		_onPreventOverlapChange = onPreventOverlapChange;

		setScopedAttribute("onPreventOverlapChange", onPreventOverlapChange);
	}

	public void setOnRenderChange(java.lang.Object onRenderChange) {
		_onRenderChange = onRenderChange;

		setScopedAttribute("onRenderChange", onRenderChange);
	}

	public void setOnRenderedChange(java.lang.Object onRenderedChange) {
		_onRenderedChange = onRenderedChange;

		setScopedAttribute("onRenderedChange", onRenderedChange);
	}

	public void setOnRequest(java.lang.Object onRequest) {
		_onRequest = onRequest;

		setScopedAttribute("onRequest", onRequest);
	}

	public void setOnShimChange(java.lang.Object onShimChange) {
		_onShimChange = onShimChange;

		setScopedAttribute("onShimChange", onShimChange);
	}

	public void setOnShowArrowsChange(java.lang.Object onShowArrowsChange) {
		_onShowArrowsChange = onShowArrowsChange;

		setScopedAttribute("onShowArrowsChange", onShowArrowsChange);
	}

	public void setOnShowCloseChange(java.lang.Object onShowCloseChange) {
		_onShowCloseChange = onShowCloseChange;

		setScopedAttribute("onShowCloseChange", onShowCloseChange);
	}

	public void setOnSrcNodeChange(java.lang.Object onSrcNodeChange) {
		_onSrcNodeChange = onSrcNodeChange;

		setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
	}

	public void setOnStringsChange(java.lang.Object onStringsChange) {
		_onStringsChange = onStringsChange;

		setScopedAttribute("onStringsChange", onStringsChange);
	}

	public void setOnTabIndexChange(java.lang.Object onTabIndexChange) {
		_onTabIndexChange = onTabIndexChange;

		setScopedAttribute("onTabIndexChange", onTabIndexChange);
	}

	public void setOnTotalLinksChange(java.lang.Object onTotalLinksChange) {
		_onTotalLinksChange = onTotalLinksChange;

		setScopedAttribute("onTotalLinksChange", onTotalLinksChange);
	}

	public void setOnVisibleChange(java.lang.Object onVisibleChange) {
		_onVisibleChange = onVisibleChange;

		setScopedAttribute("onVisibleChange", onVisibleChange);
	}

	public void setOnContentUpdate(java.lang.Object onContentUpdate) {
		_onContentUpdate = onContentUpdate;

		setScopedAttribute("onContentUpdate", onContentUpdate);
	}

	public void setOnRender(java.lang.Object onRender) {
		_onRender = onRender;

		setScopedAttribute("onRender", onRender);
	}

	public void setOnWidthChange(java.lang.Object onWidthChange) {
		_onWidthChange = onWidthChange;

		setScopedAttribute("onWidthChange", onWidthChange);
	}

	public void setOnXChange(java.lang.Object onXChange) {
		_onXChange = onXChange;

		setScopedAttribute("onXChange", onXChange);
	}

	public void setOnXyChange(java.lang.Object onXyChange) {
		_onXyChange = onXyChange;

		setScopedAttribute("onXyChange", onXyChange);
	}

	public void setOnYChange(java.lang.Object onYChange) {
		_onYChange = onYChange;

		setScopedAttribute("onYChange", onYChange);
	}

	public void setOnZIndexChange(java.lang.Object onZIndexChange) {
		_onZIndexChange = onZIndexChange;

		setScopedAttribute("onZIndexChange", onZIndexChange);
	}

	protected void cleanUp() {
		_align = null;
		_anim = true;
		_arrowLeftEl = null;
		_arrowRightEl = null;
		_imageviewerBodyContent = null;
		_boundingBox = null;
		_caption = null;
		_captionEl = null;
		_captionFromTitle = true;
		_centered = true;
		_closeEl = null;
		_constrain = null;
		_contentBox = null;
		_cssClass = null;
		_currentIndex = 0;
		_destroyed = false;
		_disabled = false;
		_fillHeight = null;
		_focused = false;
		_footerContent = null;
		_headerContent = null;
		_height = null;
		_hideClass = "yui3-aui-helper-hidden";
		_imageviewerId = null;
		_image = null;
		_imageAnim = null;
		_infoEl = null;
		_infoTemplate = "Image {current} of {total}";
		_initialized = false;
		_links = null;
		_loader = null;
		_loading = false;
		_loadingEl = null;
		_maxHeight = 2147483647;
		_maxWidth = 2147483647;
		_modal = null;
		_preloadAllImages = false;
		_preventOverlap = false;
		_render = null;
		_rendered = false;
		_shim = false;
		_showArrows = true;
		_showClose = true;
		_srcNode = null;
		_strings = null;
		_tabIndex = 0;
		_totalLinks = true;
		_visible = true;
		_width = null;
		_x = 0;
		_xy = null;
		_y = 0;
		_zIndex = 0;
		_afterAlignChange = null;
		_afterAnim = null;
		_afterAnimChange = null;
		_afterArrowLeftElChange = null;
		_afterArrowRightElChange = null;
		_afterBodyContentChange = null;
		_afterBoundingBoxChange = null;
		_afterCaptionChange = null;
		_afterCaptionElChange = null;
		_afterCaptionFromTitleChange = null;
		_afterCenteredChange = null;
		_afterCloseElChange = null;
		_afterConstrainChange = null;
		_afterContentBoxChange = null;
		_afterCssClassChange = null;
		_afterCurrentIndexChange = null;
		_afterDestroy = null;
		_afterDestroyedChange = null;
		_afterDisabledChange = null;
		_afterFillHeightChange = null;
		_afterFocusedChange = null;
		_afterFooterContentChange = null;
		_afterHeaderContentChange = null;
		_afterHeightChange = null;
		_afterHideClassChange = null;
		_afterIdChange = null;
		_afterImageAnimChange = null;
		_afterImageChange = null;
		_afterInfoElChange = null;
		_afterInfoTemplateChange = null;
		_afterInit = null;
		_afterInitializedChange = null;
		_afterLinksChange = null;
		_afterLoad = null;
		_afterLoaderChange = null;
		_afterLoadingChange = null;
		_afterLoadingElChange = null;
		_afterMaxHeightChange = null;
		_afterMaxWidthChange = null;
		_afterModalChange = null;
		_afterPreloadAllImagesChange = null;
		_afterPreventOverlapChange = null;
		_afterRenderChange = null;
		_afterRenderedChange = null;
		_afterRequest = null;
		_afterShimChange = null;
		_afterShowArrowsChange = null;
		_afterShowCloseChange = null;
		_afterSrcNodeChange = null;
		_afterStringsChange = null;
		_afterTabIndexChange = null;
		_afterTotalLinksChange = null;
		_afterVisibleChange = null;
		_afterContentUpdate = null;
		_afterRender = null;
		_afterWidthChange = null;
		_afterXChange = null;
		_afterXyChange = null;
		_afterYChange = null;
		_afterZIndexChange = null;
		_onAlignChange = null;
		_onAnim = null;
		_onAnimChange = null;
		_onArrowLeftElChange = null;
		_onArrowRightElChange = null;
		_onBodyContentChange = null;
		_onBoundingBoxChange = null;
		_onCaptionChange = null;
		_onCaptionElChange = null;
		_onCaptionFromTitleChange = null;
		_onCenteredChange = null;
		_onCloseElChange = null;
		_onConstrainChange = null;
		_onContentBoxChange = null;
		_onCssClassChange = null;
		_onCurrentIndexChange = null;
		_onDestroy = null;
		_onDestroyedChange = null;
		_onDisabledChange = null;
		_onFillHeightChange = null;
		_onFocusedChange = null;
		_onFooterContentChange = null;
		_onHeaderContentChange = null;
		_onHeightChange = null;
		_onHideClassChange = null;
		_onIdChange = null;
		_onImageAnimChange = null;
		_onImageChange = null;
		_onInfoElChange = null;
		_onInfoTemplateChange = null;
		_onInit = null;
		_onInitializedChange = null;
		_onLinksChange = null;
		_onLoad = null;
		_onLoaderChange = null;
		_onLoadingChange = null;
		_onLoadingElChange = null;
		_onMaxHeightChange = null;
		_onMaxWidthChange = null;
		_onModalChange = null;
		_onPreloadAllImagesChange = null;
		_onPreventOverlapChange = null;
		_onRenderChange = null;
		_onRenderedChange = null;
		_onRequest = null;
		_onShimChange = null;
		_onShowArrowsChange = null;
		_onShowCloseChange = null;
		_onSrcNodeChange = null;
		_onStringsChange = null;
		_onTabIndexChange = null;
		_onTotalLinksChange = null;
		_onVisibleChange = null;
		_onContentUpdate = null;
		_onRender = null;
		_onWidthChange = null;
		_onXChange = null;
		_onXyChange = null;
		_onYChange = null;
		_onZIndexChange = null;
	}

	protected String getPage() {
		return _PAGE;
	}

	protected void setAttributes(HttpServletRequest request) {
		setNamespacedAttribute(request, "align", _align);
		setNamespacedAttribute(request, "anim", _anim);
		setNamespacedAttribute(request, "arrowLeftEl", _arrowLeftEl);
		setNamespacedAttribute(request, "arrowRightEl", _arrowRightEl);
		setNamespacedAttribute(request, "imageviewerBodyContent", _imageviewerBodyContent);
		setNamespacedAttribute(request, "boundingBox", _boundingBox);
		setNamespacedAttribute(request, "caption", _caption);
		setNamespacedAttribute(request, "captionEl", _captionEl);
		setNamespacedAttribute(request, "captionFromTitle", _captionFromTitle);
		setNamespacedAttribute(request, "centered", _centered);
		setNamespacedAttribute(request, "closeEl", _closeEl);
		setNamespacedAttribute(request, "constrain", _constrain);
		setNamespacedAttribute(request, "contentBox", _contentBox);
		setNamespacedAttribute(request, "cssClass", _cssClass);
		setNamespacedAttribute(request, "currentIndex", _currentIndex);
		setNamespacedAttribute(request, "destroyed", _destroyed);
		setNamespacedAttribute(request, "disabled", _disabled);
		setNamespacedAttribute(request, "fillHeight", _fillHeight);
		setNamespacedAttribute(request, "focused", _focused);
		setNamespacedAttribute(request, "footerContent", _footerContent);
		setNamespacedAttribute(request, "headerContent", _headerContent);
		setNamespacedAttribute(request, "height", _height);
		setNamespacedAttribute(request, "hideClass", _hideClass);
		setNamespacedAttribute(request, "imageviewerId", _imageviewerId);
		setNamespacedAttribute(request, "image", _image);
		setNamespacedAttribute(request, "imageAnim", _imageAnim);
		setNamespacedAttribute(request, "infoEl", _infoEl);
		setNamespacedAttribute(request, "infoTemplate", _infoTemplate);
		setNamespacedAttribute(request, "initialized", _initialized);
		setNamespacedAttribute(request, "links", _links);
		setNamespacedAttribute(request, "loader", _loader);
		setNamespacedAttribute(request, "loading", _loading);
		setNamespacedAttribute(request, "loadingEl", _loadingEl);
		setNamespacedAttribute(request, "maxHeight", _maxHeight);
		setNamespacedAttribute(request, "maxWidth", _maxWidth);
		setNamespacedAttribute(request, "modal", _modal);
		setNamespacedAttribute(request, "preloadAllImages", _preloadAllImages);
		setNamespacedAttribute(request, "preventOverlap", _preventOverlap);
		setNamespacedAttribute(request, "render", _render);
		setNamespacedAttribute(request, "rendered", _rendered);
		setNamespacedAttribute(request, "shim", _shim);
		setNamespacedAttribute(request, "showArrows", _showArrows);
		setNamespacedAttribute(request, "showClose", _showClose);
		setNamespacedAttribute(request, "srcNode", _srcNode);
		setNamespacedAttribute(request, "strings", _strings);
		setNamespacedAttribute(request, "tabIndex", _tabIndex);
		setNamespacedAttribute(request, "totalLinks", _totalLinks);
		setNamespacedAttribute(request, "visible", _visible);
		setNamespacedAttribute(request, "width", _width);
		setNamespacedAttribute(request, "x", _x);
		setNamespacedAttribute(request, "xy", _xy);
		setNamespacedAttribute(request, "y", _y);
		setNamespacedAttribute(request, "zIndex", _zIndex);
		setNamespacedAttribute(request, "afterAlignChange", _afterAlignChange);
		setNamespacedAttribute(request, "afterAnim", _afterAnim);
		setNamespacedAttribute(request, "afterAnimChange", _afterAnimChange);
		setNamespacedAttribute(request, "afterArrowLeftElChange", _afterArrowLeftElChange);
		setNamespacedAttribute(request, "afterArrowRightElChange", _afterArrowRightElChange);
		setNamespacedAttribute(request, "afterBodyContentChange", _afterBodyContentChange);
		setNamespacedAttribute(request, "afterBoundingBoxChange", _afterBoundingBoxChange);
		setNamespacedAttribute(request, "afterCaptionChange", _afterCaptionChange);
		setNamespacedAttribute(request, "afterCaptionElChange", _afterCaptionElChange);
		setNamespacedAttribute(request, "afterCaptionFromTitleChange", _afterCaptionFromTitleChange);
		setNamespacedAttribute(request, "afterCenteredChange", _afterCenteredChange);
		setNamespacedAttribute(request, "afterCloseElChange", _afterCloseElChange);
		setNamespacedAttribute(request, "afterConstrainChange", _afterConstrainChange);
		setNamespacedAttribute(request, "afterContentBoxChange", _afterContentBoxChange);
		setNamespacedAttribute(request, "afterCssClassChange", _afterCssClassChange);
		setNamespacedAttribute(request, "afterCurrentIndexChange", _afterCurrentIndexChange);
		setNamespacedAttribute(request, "afterDestroy", _afterDestroy);
		setNamespacedAttribute(request, "afterDestroyedChange", _afterDestroyedChange);
		setNamespacedAttribute(request, "afterDisabledChange", _afterDisabledChange);
		setNamespacedAttribute(request, "afterFillHeightChange", _afterFillHeightChange);
		setNamespacedAttribute(request, "afterFocusedChange", _afterFocusedChange);
		setNamespacedAttribute(request, "afterFooterContentChange", _afterFooterContentChange);
		setNamespacedAttribute(request, "afterHeaderContentChange", _afterHeaderContentChange);
		setNamespacedAttribute(request, "afterHeightChange", _afterHeightChange);
		setNamespacedAttribute(request, "afterHideClassChange", _afterHideClassChange);
		setNamespacedAttribute(request, "afterIdChange", _afterIdChange);
		setNamespacedAttribute(request, "afterImageAnimChange", _afterImageAnimChange);
		setNamespacedAttribute(request, "afterImageChange", _afterImageChange);
		setNamespacedAttribute(request, "afterInfoElChange", _afterInfoElChange);
		setNamespacedAttribute(request, "afterInfoTemplateChange", _afterInfoTemplateChange);
		setNamespacedAttribute(request, "afterInit", _afterInit);
		setNamespacedAttribute(request, "afterInitializedChange", _afterInitializedChange);
		setNamespacedAttribute(request, "afterLinksChange", _afterLinksChange);
		setNamespacedAttribute(request, "afterLoad", _afterLoad);
		setNamespacedAttribute(request, "afterLoaderChange", _afterLoaderChange);
		setNamespacedAttribute(request, "afterLoadingChange", _afterLoadingChange);
		setNamespacedAttribute(request, "afterLoadingElChange", _afterLoadingElChange);
		setNamespacedAttribute(request, "afterMaxHeightChange", _afterMaxHeightChange);
		setNamespacedAttribute(request, "afterMaxWidthChange", _afterMaxWidthChange);
		setNamespacedAttribute(request, "afterModalChange", _afterModalChange);
		setNamespacedAttribute(request, "afterPreloadAllImagesChange", _afterPreloadAllImagesChange);
		setNamespacedAttribute(request, "afterPreventOverlapChange", _afterPreventOverlapChange);
		setNamespacedAttribute(request, "afterRenderChange", _afterRenderChange);
		setNamespacedAttribute(request, "afterRenderedChange", _afterRenderedChange);
		setNamespacedAttribute(request, "afterRequest", _afterRequest);
		setNamespacedAttribute(request, "afterShimChange", _afterShimChange);
		setNamespacedAttribute(request, "afterShowArrowsChange", _afterShowArrowsChange);
		setNamespacedAttribute(request, "afterShowCloseChange", _afterShowCloseChange);
		setNamespacedAttribute(request, "afterSrcNodeChange", _afterSrcNodeChange);
		setNamespacedAttribute(request, "afterStringsChange", _afterStringsChange);
		setNamespacedAttribute(request, "afterTabIndexChange", _afterTabIndexChange);
		setNamespacedAttribute(request, "afterTotalLinksChange", _afterTotalLinksChange);
		setNamespacedAttribute(request, "afterVisibleChange", _afterVisibleChange);
		setNamespacedAttribute(request, "afterContentUpdate", _afterContentUpdate);
		setNamespacedAttribute(request, "afterRender", _afterRender);
		setNamespacedAttribute(request, "afterWidthChange", _afterWidthChange);
		setNamespacedAttribute(request, "afterXChange", _afterXChange);
		setNamespacedAttribute(request, "afterXyChange", _afterXyChange);
		setNamespacedAttribute(request, "afterYChange", _afterYChange);
		setNamespacedAttribute(request, "afterZIndexChange", _afterZIndexChange);
		setNamespacedAttribute(request, "onAlignChange", _onAlignChange);
		setNamespacedAttribute(request, "onAnim", _onAnim);
		setNamespacedAttribute(request, "onAnimChange", _onAnimChange);
		setNamespacedAttribute(request, "onArrowLeftElChange", _onArrowLeftElChange);
		setNamespacedAttribute(request, "onArrowRightElChange", _onArrowRightElChange);
		setNamespacedAttribute(request, "onBodyContentChange", _onBodyContentChange);
		setNamespacedAttribute(request, "onBoundingBoxChange", _onBoundingBoxChange);
		setNamespacedAttribute(request, "onCaptionChange", _onCaptionChange);
		setNamespacedAttribute(request, "onCaptionElChange", _onCaptionElChange);
		setNamespacedAttribute(request, "onCaptionFromTitleChange", _onCaptionFromTitleChange);
		setNamespacedAttribute(request, "onCenteredChange", _onCenteredChange);
		setNamespacedAttribute(request, "onCloseElChange", _onCloseElChange);
		setNamespacedAttribute(request, "onConstrainChange", _onConstrainChange);
		setNamespacedAttribute(request, "onContentBoxChange", _onContentBoxChange);
		setNamespacedAttribute(request, "onCssClassChange", _onCssClassChange);
		setNamespacedAttribute(request, "onCurrentIndexChange", _onCurrentIndexChange);
		setNamespacedAttribute(request, "onDestroy", _onDestroy);
		setNamespacedAttribute(request, "onDestroyedChange", _onDestroyedChange);
		setNamespacedAttribute(request, "onDisabledChange", _onDisabledChange);
		setNamespacedAttribute(request, "onFillHeightChange", _onFillHeightChange);
		setNamespacedAttribute(request, "onFocusedChange", _onFocusedChange);
		setNamespacedAttribute(request, "onFooterContentChange", _onFooterContentChange);
		setNamespacedAttribute(request, "onHeaderContentChange", _onHeaderContentChange);
		setNamespacedAttribute(request, "onHeightChange", _onHeightChange);
		setNamespacedAttribute(request, "onHideClassChange", _onHideClassChange);
		setNamespacedAttribute(request, "onIdChange", _onIdChange);
		setNamespacedAttribute(request, "onImageAnimChange", _onImageAnimChange);
		setNamespacedAttribute(request, "onImageChange", _onImageChange);
		setNamespacedAttribute(request, "onInfoElChange", _onInfoElChange);
		setNamespacedAttribute(request, "onInfoTemplateChange", _onInfoTemplateChange);
		setNamespacedAttribute(request, "onInit", _onInit);
		setNamespacedAttribute(request, "onInitializedChange", _onInitializedChange);
		setNamespacedAttribute(request, "onLinksChange", _onLinksChange);
		setNamespacedAttribute(request, "onLoad", _onLoad);
		setNamespacedAttribute(request, "onLoaderChange", _onLoaderChange);
		setNamespacedAttribute(request, "onLoadingChange", _onLoadingChange);
		setNamespacedAttribute(request, "onLoadingElChange", _onLoadingElChange);
		setNamespacedAttribute(request, "onMaxHeightChange", _onMaxHeightChange);
		setNamespacedAttribute(request, "onMaxWidthChange", _onMaxWidthChange);
		setNamespacedAttribute(request, "onModalChange", _onModalChange);
		setNamespacedAttribute(request, "onPreloadAllImagesChange", _onPreloadAllImagesChange);
		setNamespacedAttribute(request, "onPreventOverlapChange", _onPreventOverlapChange);
		setNamespacedAttribute(request, "onRenderChange", _onRenderChange);
		setNamespacedAttribute(request, "onRenderedChange", _onRenderedChange);
		setNamespacedAttribute(request, "onRequest", _onRequest);
		setNamespacedAttribute(request, "onShimChange", _onShimChange);
		setNamespacedAttribute(request, "onShowArrowsChange", _onShowArrowsChange);
		setNamespacedAttribute(request, "onShowCloseChange", _onShowCloseChange);
		setNamespacedAttribute(request, "onSrcNodeChange", _onSrcNodeChange);
		setNamespacedAttribute(request, "onStringsChange", _onStringsChange);
		setNamespacedAttribute(request, "onTabIndexChange", _onTabIndexChange);
		setNamespacedAttribute(request, "onTotalLinksChange", _onTotalLinksChange);
		setNamespacedAttribute(request, "onVisibleChange", _onVisibleChange);
		setNamespacedAttribute(request, "onContentUpdate", _onContentUpdate);
		setNamespacedAttribute(request, "onRender", _onRender);
		setNamespacedAttribute(request, "onWidthChange", _onWidthChange);
		setNamespacedAttribute(request, "onXChange", _onXChange);
		setNamespacedAttribute(request, "onXyChange", _onXyChange);
		setNamespacedAttribute(request, "onYChange", _onYChange);
		setNamespacedAttribute(request, "onZIndexChange", _onZIndexChange);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "alloy:image-viewer:";

	private static final String _PAGE =
		"/html/taglib/alloy/image_viewer/page.jsp";

	protected java.lang.Object _align;
	protected boolean _anim;
	protected java.lang.Object _arrowLeftEl;
	protected java.lang.Object _arrowRightEl;
	protected java.lang.Object _imageviewerBodyContent;
	protected java.lang.String _boundingBox;
	protected java.lang.String _caption;
	protected java.lang.Object _captionEl;
	protected boolean _captionFromTitle;
	protected boolean _centered;
	protected java.lang.Object _closeEl;
	protected java.lang.Object _constrain;
	protected java.lang.String _contentBox;
	protected java.lang.String _cssClass;
	protected java.lang.Object _currentIndex;
	protected boolean _destroyed;
	protected boolean _disabled;
	protected java.lang.Object _fillHeight;
	protected boolean _focused;
	protected java.lang.Object _footerContent;
	protected java.lang.Object _headerContent;
	protected java.lang.Object _height;
	protected java.lang.String _hideClass;
	protected java.lang.String _imageviewerId;
	protected java.lang.Object _image;
	protected java.lang.Object _imageAnim;
	protected java.lang.Object _infoEl;
	protected java.lang.String _infoTemplate;
	protected boolean _initialized;
	protected java.lang.Object _links;
	protected java.lang.Object _loader;
	protected boolean _loading;
	protected java.lang.Object _loadingEl;
	protected java.lang.Object _maxHeight;
	protected java.lang.Object _maxWidth;
	protected java.lang.Object _modal;
	protected boolean _preloadAllImages;
	protected boolean _preventOverlap;
	protected java.lang.Object _render;
	protected boolean _rendered;
	protected boolean _shim;
	protected boolean _showArrows;
	protected boolean _showClose;
	protected java.lang.String _srcNode;
	protected java.lang.Object _strings;
	protected java.lang.Object _tabIndex;
	protected boolean _totalLinks;
	protected boolean _visible;
	protected java.lang.Object _width;
	protected java.lang.Object _x;
	protected java.lang.Object _xy;
	protected java.lang.Object _y;
	protected java.lang.Object _zIndex;
	protected java.lang.Object _afterAlignChange;
	protected java.lang.Object _afterAnim;
	protected java.lang.Object _afterAnimChange;
	protected java.lang.Object _afterArrowLeftElChange;
	protected java.lang.Object _afterArrowRightElChange;
	protected java.lang.Object _afterBodyContentChange;
	protected java.lang.Object _afterBoundingBoxChange;
	protected java.lang.Object _afterCaptionChange;
	protected java.lang.Object _afterCaptionElChange;
	protected java.lang.Object _afterCaptionFromTitleChange;
	protected java.lang.Object _afterCenteredChange;
	protected java.lang.Object _afterCloseElChange;
	protected java.lang.Object _afterConstrainChange;
	protected java.lang.Object _afterContentBoxChange;
	protected java.lang.Object _afterCssClassChange;
	protected java.lang.Object _afterCurrentIndexChange;
	protected java.lang.Object _afterDestroy;
	protected java.lang.Object _afterDestroyedChange;
	protected java.lang.Object _afterDisabledChange;
	protected java.lang.Object _afterFillHeightChange;
	protected java.lang.Object _afterFocusedChange;
	protected java.lang.Object _afterFooterContentChange;
	protected java.lang.Object _afterHeaderContentChange;
	protected java.lang.Object _afterHeightChange;
	protected java.lang.Object _afterHideClassChange;
	protected java.lang.Object _afterIdChange;
	protected java.lang.Object _afterImageAnimChange;
	protected java.lang.Object _afterImageChange;
	protected java.lang.Object _afterInfoElChange;
	protected java.lang.Object _afterInfoTemplateChange;
	protected java.lang.Object _afterInit;
	protected java.lang.Object _afterInitializedChange;
	protected java.lang.Object _afterLinksChange;
	protected java.lang.Object _afterLoad;
	protected java.lang.Object _afterLoaderChange;
	protected java.lang.Object _afterLoadingChange;
	protected java.lang.Object _afterLoadingElChange;
	protected java.lang.Object _afterMaxHeightChange;
	protected java.lang.Object _afterMaxWidthChange;
	protected java.lang.Object _afterModalChange;
	protected java.lang.Object _afterPreloadAllImagesChange;
	protected java.lang.Object _afterPreventOverlapChange;
	protected java.lang.Object _afterRenderChange;
	protected java.lang.Object _afterRenderedChange;
	protected java.lang.Object _afterRequest;
	protected java.lang.Object _afterShimChange;
	protected java.lang.Object _afterShowArrowsChange;
	protected java.lang.Object _afterShowCloseChange;
	protected java.lang.Object _afterSrcNodeChange;
	protected java.lang.Object _afterStringsChange;
	protected java.lang.Object _afterTabIndexChange;
	protected java.lang.Object _afterTotalLinksChange;
	protected java.lang.Object _afterVisibleChange;
	protected java.lang.Object _afterContentUpdate;
	protected java.lang.Object _afterRender;
	protected java.lang.Object _afterWidthChange;
	protected java.lang.Object _afterXChange;
	protected java.lang.Object _afterXyChange;
	protected java.lang.Object _afterYChange;
	protected java.lang.Object _afterZIndexChange;
	protected java.lang.Object _onAlignChange;
	protected java.lang.Object _onAnim;
	protected java.lang.Object _onAnimChange;
	protected java.lang.Object _onArrowLeftElChange;
	protected java.lang.Object _onArrowRightElChange;
	protected java.lang.Object _onBodyContentChange;
	protected java.lang.Object _onBoundingBoxChange;
	protected java.lang.Object _onCaptionChange;
	protected java.lang.Object _onCaptionElChange;
	protected java.lang.Object _onCaptionFromTitleChange;
	protected java.lang.Object _onCenteredChange;
	protected java.lang.Object _onCloseElChange;
	protected java.lang.Object _onConstrainChange;
	protected java.lang.Object _onContentBoxChange;
	protected java.lang.Object _onCssClassChange;
	protected java.lang.Object _onCurrentIndexChange;
	protected java.lang.Object _onDestroy;
	protected java.lang.Object _onDestroyedChange;
	protected java.lang.Object _onDisabledChange;
	protected java.lang.Object _onFillHeightChange;
	protected java.lang.Object _onFocusedChange;
	protected java.lang.Object _onFooterContentChange;
	protected java.lang.Object _onHeaderContentChange;
	protected java.lang.Object _onHeightChange;
	protected java.lang.Object _onHideClassChange;
	protected java.lang.Object _onIdChange;
	protected java.lang.Object _onImageAnimChange;
	protected java.lang.Object _onImageChange;
	protected java.lang.Object _onInfoElChange;
	protected java.lang.Object _onInfoTemplateChange;
	protected java.lang.Object _onInit;
	protected java.lang.Object _onInitializedChange;
	protected java.lang.Object _onLinksChange;
	protected java.lang.Object _onLoad;
	protected java.lang.Object _onLoaderChange;
	protected java.lang.Object _onLoadingChange;
	protected java.lang.Object _onLoadingElChange;
	protected java.lang.Object _onMaxHeightChange;
	protected java.lang.Object _onMaxWidthChange;
	protected java.lang.Object _onModalChange;
	protected java.lang.Object _onPreloadAllImagesChange;
	protected java.lang.Object _onPreventOverlapChange;
	protected java.lang.Object _onRenderChange;
	protected java.lang.Object _onRenderedChange;
	protected java.lang.Object _onRequest;
	protected java.lang.Object _onShimChange;
	protected java.lang.Object _onShowArrowsChange;
	protected java.lang.Object _onShowCloseChange;
	protected java.lang.Object _onSrcNodeChange;
	protected java.lang.Object _onStringsChange;
	protected java.lang.Object _onTabIndexChange;
	protected java.lang.Object _onTotalLinksChange;
	protected java.lang.Object _onVisibleChange;
	protected java.lang.Object _onContentUpdate;
	protected java.lang.Object _onRender;
	protected java.lang.Object _onWidthChange;
	protected java.lang.Object _onXChange;
	protected java.lang.Object _onXyChange;
	protected java.lang.Object _onYChange;
	protected java.lang.Object _onZIndexChange;

}
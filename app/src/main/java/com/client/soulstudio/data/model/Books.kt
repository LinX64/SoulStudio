package com.client.soulstudio.data.model
import androidx.annotation.Keep

import com.google.gson.annotations.SerializedName


@Keep
data class Books(
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("totalItems")
    val totalItems: Int
)

@Keep
data class Item(
    @SerializedName("accessInfo")
    val accessInfo: AccessInfo,
    @SerializedName("etag")
    val etag: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("saleInfo")
    val saleInfo: SaleInfo,
    @SerializedName("searchInfo")
    val searchInfo: SearchInfo,
    @SerializedName("selfLink")
    val selfLink: String,
    @SerializedName("volumeInfo")
    val volumeInfo: VolumeInfo
)

@Keep
data class AccessInfo(
    @SerializedName("accessViewStatus")
    val accessViewStatus: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("embeddable")
    val embeddable: Boolean,
    @SerializedName("epub")
    val epub: Epub,
    @SerializedName("pdf")
    val pdf: Pdf,
    @SerializedName("publicDomain")
    val publicDomain: Boolean,
    @SerializedName("quoteSharingAllowed")
    val quoteSharingAllowed: Boolean,
    @SerializedName("textToSpeechPermission")
    val textToSpeechPermission: String,
    @SerializedName("viewability")
    val viewability: String,
    @SerializedName("webReaderLink")
    val webReaderLink: String
)

@Keep
data class SaleInfo(
    @SerializedName("buyLink")
    val buyLink: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("isEbook")
    val isEbook: Boolean,
    @SerializedName("saleability")
    val saleability: String
)

@Keep
data class SearchInfo(
    @SerializedName("textSnippet")
    val textSnippet: String
)

@Keep
data class VolumeInfo(
    @SerializedName("allowAnonLogging")
    val allowAnonLogging: Boolean,
    @SerializedName("authors")
    val authors: List<String>,
    @SerializedName("canonicalVolumeLink")
    val canonicalVolumeLink: String,
    @SerializedName("categories")
    val categories: List<String>,
    @SerializedName("contentVersion")
    val contentVersion: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("imageLinks")
    val imageLinks: ImageLinks,
    @SerializedName("industryIdentifiers")
    val industryIdentifiers: List<IndustryIdentifier>,
    @SerializedName("infoLink")
    val infoLink: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("maturityRating")
    val maturityRating: String,
    @SerializedName("pageCount")
    val pageCount: Int,
    @SerializedName("panelizationSummary")
    val panelizationSummary: PanelizationSummary,
    @SerializedName("previewLink")
    val previewLink: String,
    @SerializedName("printType")
    val printType: String,
    @SerializedName("publishedDate")
    val publishedDate: String,
    @SerializedName("publisher")
    val publisher: String,
    @SerializedName("readingModes")
    val readingModes: ReadingModes,
    @SerializedName("subtitle")
    val subtitle: String,
    @SerializedName("title")
    val title: String
)

@Keep
data class Epub(
    @SerializedName("acsTokenLink")
    val acsTokenLink: String,
    @SerializedName("downloadLink")
    val downloadLink: String,
    @SerializedName("isAvailable")
    val isAvailable: Boolean
)

@Keep
data class Pdf(
    @SerializedName("acsTokenLink")
    val acsTokenLink: String,
    @SerializedName("isAvailable")
    val isAvailable: Boolean
)

@Keep
data class ImageLinks(
    @SerializedName("smallThumbnail")
    val smallThumbnail: String,
    @SerializedName("thumbnail")
    val thumbnail: String
)

@Keep
data class IndustryIdentifier(
    @SerializedName("identifier")
    val identifier: String,
    @SerializedName("type")
    val type: String
)

@Keep
data class PanelizationSummary(
    @SerializedName("containsEpubBubbles")
    val containsEpubBubbles: Boolean,
    @SerializedName("containsImageBubbles")
    val containsImageBubbles: Boolean
)

@Keep
data class ReadingModes(
    @SerializedName("image")
    val image: Boolean,
    @SerializedName("text")
    val text: Boolean
)
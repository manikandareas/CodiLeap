package com.manikandareas.codileap.home.presentation.model

data class CarouselUi(
    val items: List<CarouselItemUi>
)

data class CarouselItemUi(
    val imageUrl: String,
    val title: String? = null,
    val subtitle: String? = null,
    val moduleCount: Int = 0,
    val userCount: Int = 0,
    val onClick: () -> Unit = {}
)

val DummyCarouselUi = CarouselUi(
    items = listOf(
        // Machine Learning Path
        CarouselItemUi(
            imageUrl = "https://images.unsplash.com/photo-1549692520-acc6669e2f0c?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            title = "Mastering Machine Learning",
            subtitle = "Understand the core concepts of ML",
            moduleCount = 12,
            userCount = 250
        ),

        // Mobile Development Path
        CarouselItemUi(
            imageUrl = "https://images.unsplash.com/photo-1629904853893-c2c8981a1dc5?q=80&w=3270&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            title = "Introduction to Mobile Development",
            subtitle = "Learn the basics of mobile app development",
            moduleCount = 8,
            userCount = 300
        ),

        // Cloud Computing Path
        CarouselItemUi(
            imageUrl = "https://images.unsplash.com/photo-1637937459053-c788742455be?q=80&w=3404&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            title = "Introduction to Cloud Computing",
            subtitle = "Learn the basics of cloud computing",
            moduleCount = 6,
            userCount = 320
        )
    )
)

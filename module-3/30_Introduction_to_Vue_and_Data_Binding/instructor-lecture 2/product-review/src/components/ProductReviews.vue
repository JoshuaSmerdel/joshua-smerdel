<template>
  <div class="main">
    <h1>Product Reviews for ...{{ title }}</h1>
    <p>{{ description }}</p>

    <!--    add the summary wells here-->
    <div class="well-display">
      <div class="well">
        <span class="amount">{{ averageRating }}</span>
        Average Rating
      </div>
      <div class="well">
        <span class="amount">{{ oneStarReviews }}</span>
        1 Star Review{{ oneStarReviews === 1 ? '' : 's' }}
      </div>
      <div class="well">
        <span class="amount">{{ twoStarReviews }}</span>
        2 Star Review{{ twoStarReviews === 1 ? '' : 's' }}
      </div>
      <div class="well">
        <span class="amount">{{ threeStarReviews }}</span>
        3 Star Review{{ threeStarReviews === 1 ? '' : 's' }}
      </div>
      <div class="well">
        <span class="amount">{{ fourStarReviews }}</span>
        4 Star Review{{ fourStarReviews === 1 ? '' : 's' }}
      </div>
      <div class="well">
        <span class="amount">{{ fiveStarReviews }}</span>
        5 Star Review{{ fiveStarReviews === 1 ? '' : 's' }}
      </div>
    </div>

    <!--Loop through all reviews-->
    <div class="review"
         v-bind:class="{favorite: review.isFavorite}"
         v-for="review in reviews"
         v-bind:key="review.id">
      <h4>
        {{ review.reviewer }}
      </h4>
      <div class="rating">
        <img src="../assets/star.png" alt="star image" v-for="n in review.rating" v-bind:key="n">
      </div>
      <h3>{{ review.title }}</h3>
      <p>{{ review.review }}</p>
      <p>Favorite? <input type="checkbox" v-model="review.isFavorite"></p>
    </div>
  </div>

</template>

<script>
export default {
//  this is my model for the view
//  name is required - used for the HTML tag
  name: 'product-reviews',
  data() {
    return {
      title: 'Cigar Parties for Dummies.',
      description: 'Host and plan the perfect party',
      reviews: [
        {
          reviewer: "Malcolm Gladwell",
          title: "What a book!",
          review:
              "It certainly is a book. I mean, I can see that. Pages kept together with glue and there's writing on it, in some language.",
          rating: 3,
          isFavorite: false
        },
        {
          reviewer: "Tim Ferriss",
          title: "Had a cigar party started in less than 4 hours.",
          review:
              "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
          rating: 4,
          isFavorite: false
        },
        {
          reviewer: "Ramit Sethi",
          title: "What every new entrepreneurs needs. A door stop.",
          review:
              "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
          rating: 1,
          isFavorite: false
        },
        {
          reviewer: "Gary Vaynerchuk",
          title: "And I thought I could write",
          review:
              "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
          rating: 3,
          isFavorite: false
        }
      ]
    };
  },
  computed: {
    averageRating() {
      const sum = this.reviews.reduce((currentSum, review) => {
        return currentSum + review.rating;
      }, 0);

      return sum / this.reviews.length;
    },
    oneStarReviews() {
      const reviews = this.reviews.filter(review => review.rating === 1);
      return reviews.length;
    },
    twoStarReviews() {
      const reviews = this.reviews.filter(review => review.rating === 2);
      return reviews.length;
    },
    threeStarReviews() {
      const reviews = this.reviews.filter(review => review.rating === 3);
      return reviews.length;
    },
    fourStarReviews() {
      const reviews = this.reviews.filter(review => review.rating === 4);
      return reviews.length;
    },
    fiveStarReviews() {
      const reviews = this.reviews.filter(review => review.rating === 5);
      return reviews.length;
    }
  }
}


</script>

<style scoped>

</style>